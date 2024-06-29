import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class596 implements Runnable {
   @OriginalMember(
      owner = "client!ul",
      name = "i",
      descriptor = "I"
   )
   private int field8602 = 0;
   @OriginalMember(
      owner = "client!ul",
      name = "n",
      descriptor = "I"
   )
   private int field8607 = 0;
   @OriginalMember(
      owner = "client!ul",
      name = "h",
      descriptor = "I"
   )
   private int field8606;
   @OriginalMember(
      owner = "client!ul",
      name = "f",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field8605;
   @OriginalMember(
      owner = "client!ul",
      name = "j",
      descriptor = "[B"
   )
   private byte[] field8601;
   @OriginalMember(
      owner = "client!ul",
      name = "l",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field8600;
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8608 = new String[]{method4409(method4408("BG%?0Y\u0003")), method4409(method4408("\u0017\u0006+")), method4409(method4408("X[n#6Y")), method4409(method4408("BG%\bm")), method4409(method4408("Y^g!")), method4409(method4408("\u0017B{w")), method4409(method4408("\u000bBf*x\u0007\u0015")), method4409(method4408("^E}\"\u007f")), method4409(method4408("c\u001a+`e")), method4409(method4408("\u000bBf*x\u0006\u0015")), method4409(method4408("BG%q,YB\u007fsm")), method4409(method4408("L\u0005%c8")), method4409(method4408("BG%\u000fm")), method4409(method4408("BG%\tm")), method4409(method4408("BG%\u000em")), method4409(method4408("BG%\fm"))};
   @OriginalMember(
      owner = "client!ul",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field8595 = false;
   @OriginalMember(
      owner = "client!ul",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field8594 = false;
   @OriginalMember(
      owner = "client!ul",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field8591 = new int[]{-1, -1, 1, 1};
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "D"
   )
   public static double field8596;
   @OriginalMember(
      owner = "client!ul",
      name = "k",
      descriptor = "I"
   )
   public static int field8592;
   @OriginalMember(
      owner = "client!ul",
      name = "p",
      descriptor = "I"
   )
   public static int field8598;
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "I"
   )
   public static int field8599;
   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "I"
   )
   public static int field8603;
   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "I"
   )
   public static int field8604;
   @OriginalMember(
      owner = "client!ul",
      name = "q",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field8593;
   @OriginalMember(
      owner = "client!ul",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8597;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4403(int arg0) {
      try {
         field8591 = null;
         field8597 = null;
         if (arg0 >= -66) {
            method4403(-54);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8608[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4564;

      try {
         ++field8598;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label63: {
                     if (this.field8593 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field8602 >= this.field8607) {
                        var3 = this.field8602 - this.field8607;
                        if (!var1) {
                           break label63;
                        }
                     }

                     var3 = this.field8606 + this.field8602 + -this.field8607;
                  }

                  if (var3 > 0) {
                     break;
                  }

                  try {
                     this.field8605.flush();
                  } catch (IOException var19) {
                     this.field8593 = var19;
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var20) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            try {
               if (this.field8607 + var3 > this.field8606) {
                  int var5 = -this.field8607 + this.field8606;
                  this.field8605.write(this.field8601, this.field8607, var5);
                  this.field8605.write(this.field8601, 0, -var5 + var3);
               } else {
                  this.field8605.write(this.field8601, this.field8607, var3);
               }
            } catch (IOException var18) {
               IOException var6 = var18;
               synchronized(this) {
                  this.field8593 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field8607 = (this.field8607 + var3) % this.field8606;
            }
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field8608[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4404(byte arg0) {
      try {
         ++field8599;
         synchronized(this) {
            if (this.field8593 == null) {
               this.field8593 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            int var3 = -50 % ((-55 - arg0) / 42);
            this.field8600.join();
         } catch (InterruptedException var5) {
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8608[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(BI[BI)V"
   )
   public final void method4405(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field4564;

      try {
         if (arg0 != -82) {
            field8594 = true;
         }

         ++field8592;
         if (arg1 >= 0 && arg3 >= 0 && ~arg2.length <= ~(arg1 + arg3)) {
            synchronized(this) {
               if (this.field8593 != null) {
                  throw new IOException(this.field8593.toString());
               } else {
                  int var7;
                  label49: {
                     if (this.field8607 <= this.field8602) {
                        var7 = -this.field8602 + this.field8607 + this.field8606 - 1;
                        if (!var5) {
                           break label49;
                        }
                     }

                     var7 = -this.field8602 + this.field8607 + -1;
                  }

                  if (var7 < arg1) {
                     throw new IOException("");
                  } else {
                     label43: {
                        if (~(this.field8602 + arg1) < ~this.field8606) {
                           int var8 = this.field8606 - this.field8602;
                           class365.method2856(arg2, arg3, this.field8601, this.field8602, var8);
                           class365.method2856(arg2, arg3 + var8, this.field8601, 0, -var8 + arg1);
                           if (!var5) {
                              break label43;
                           }
                        }

                        class365.method2856(arg2, arg3, this.field8601, this.field8602, arg1);
                     }

                     this.field8602 = (this.field8602 + arg1) % this.field8606;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8608[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8608[11] : field8608[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4406(boolean arg0) {
      try {
         if (!arg0) {
            this.field8605 = new class55();
            ++field8604;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8608[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method4407(byte param0) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ul",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V"
   )
   public class596(OutputStream arg0, int arg1) {
      try {
         this.field8606 = arg1 + 1;
         this.field8605 = arg0;
         this.field8601 = new byte[this.field8606];
         this.field8600 = new Thread(this);
         this.field8600.setDaemon(true);
         this.field8600.start();
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8608[10] + (arg0 != null ? field8608[11] : field8608[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4408(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4409(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

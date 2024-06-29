import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class524 extends class350 {
   @OriginalMember(
      owner = "client!jc",
      name = "K",
      descriptor = "[[B"
   )
   private byte[][] field7345 = new byte[10][];
   @OriginalMember(
      owner = "client!jc",
      name = "H",
      descriptor = "Lgea;"
   )
   private class66 field7340 = new class66((byte[])null);
   @OriginalMember(
      owner = "client!jc",
      name = "I",
      descriptor = "Lgea;"
   )
   private class66 field7349 = new class66((byte[])null);
   @OriginalMember(
      owner = "client!jc",
      name = "J",
      descriptor = "Lww;"
   )
   private class339 field7343;
   @OriginalMember(
      owner = "client!jc",
      name = "O",
      descriptor = "I"
   )
   private int field7346;
   @OriginalMember(
      owner = "client!jc",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7351 = new String[]{method3926(method3925("G#-\r\bA#5\u000b\b\u007f75\u0018O@'")), method3926(method3925("A-:\b\u0016")), method3926(method3925("G#-\r\bA#5\u000b\b_'=\u0000CN6u-EN'(\u001fOO.>#DG'8\u0018")), method3926(method3925("@%")), method3926(method3925("G#-\r\bA#5\u000b\b~6)\u0005HJ")), method3926(method3925("G!u9\u000e")), method3926(method3925("C77\u0000")), method3926(method3925("VluB[")), method3926(method3925("G#-\r\bA#5\u000b\bn.:\u001fU")), method3926(method3925("^'/-EN'(\u001fOO.>")), method3926(method3925("G!uPOC+/R\u000e")), method3926(method3925("G!u$\u000e")), method3926(method3925("G!u8\u000e"))};
   @OriginalMember(
      owner = "client!jc",
      name = "M",
      descriptor = "I"
   )
   public static int field7342;
   @OriginalMember(
      owner = "client!jc",
      name = "G",
      descriptor = "I"
   )
   public static int field7344;
   @OriginalMember(
      owner = "client!jc",
      name = "Q",
      descriptor = "I"
   )
   public static int field7347;
   @OriginalMember(
      owner = "client!jc",
      name = "L",
      descriptor = "I"
   )
   private int field7348;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jc",
      name = "N",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7350;
   @OriginalMember(
      owner = "client!jc",
      name = "P",
      descriptor = "[I"
   )
   private int[] field7341;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(I[B)I"
   )
   public final int method2773(int arg0, byte[] arg1) throws IOException {
      boolean var3 = client.field1481;

      try {
         ++field7347;
         if (arg0 < 32) {
            this.field7349 = null;
         }

         if (this.field7341 == null) {
            if (!this.field7343.method2690(this.field7346, 0, 121)) {
               return 0;
            }

            byte[] var4 = this.field7343.method2697(0, this.field7346, false);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field7349.field864 = 0;
            this.field7349.field859 = var4;
            int var5 = var4.length >> 1;
            this.field7341 = new int[var5];
            int var6 = 0;
            if (var3 || ~var6 > ~var5) {
               do {
                  this.field7341[var6] = this.field7349.method603(-2);
                  ++var6;
               } while(~var6 > ~var5);
            }
         }

         if (~this.field7341.length >= ~this.field7348) {
            return -1;
         } else {
            this.method3922((byte)123);
            this.field7349.field859 = arg1;
            this.field7349.field864 = 0;
            if (!var3 && ~this.field7349.field859.length >= ~this.field7349.field864) {
               this.field7349.field859 = null;
               return arg1.length;
            } else {
               label89:
               do {
                  if (this.field7340.field859 == null) {
                     if (this.field7345[0] == null) {
                        this.field7349.field859 = null;
                        return this.field7349.field864;
                     }

                     this.field7340.field859 = this.field7345[0];
                  }

                  int var7 = this.field7349.field859.length - this.field7349.field864;
                  int var8 = this.field7340.field859.length + -this.field7340.field864;
                  int var10000 = var7;

                  do {
                     if (var10000 < var8) {
                        this.field7340.method632(this.field7349.field864, var7, (byte)35, this.field7349.field859);
                        this.field7349.field859 = null;
                        return arg1.length;
                     }

                     this.field7349.method601(90, var8, this.field7340.field864, this.field7340.field859);
                     this.field7340.field864 = 0;
                     ++this.field7348;
                     this.field7340.field859 = null;
                     int var9 = 0;
                     if (var3) {
                        this.field7345[var9] = this.field7345[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        class524 var12;
                        if (~var9 <= -10) {
                           this.field7345[9] = null;
                           var12 = this;
                           if (!var3) {
                              if (this.field7341.length > this.field7348) {
                                 continue label89;
                              }

                              this.field7349.field859 = null;
                              var10000 = this.field7349.field864;
                              break;
                           }
                        } else {
                           var12 = this;
                        }

                        var12.field7345[var9] = this.field7345[var9 + 1];
                        ++var9;
                     }
                  } while(var3);

                  return var10000;
               } while(~this.field7349.field859.length < ~this.field7349.field864);

               this.field7349.field859 = null;
               return arg1.length;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field7351[11] + arg0 + ',' + (arg1 != null ? field7351[7] : field7351[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "<init>",
      descriptor = "(ILww;I)V"
   )
   public class524(int arg0, class339 arg1, int arg2) {
      super(arg0);

      try {
         this.field7343 = arg1;
         this.field7346 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7351[10] + arg0 + ',' + (arg1 != null ? field7351[7] : field7351[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method3922(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field7342;
         if (arg0 > 92) {
            if (this.field7341 != null) {
               int var3 = 0;
               if (!var2) {
                  if (var3 >= 10) {
                     return;
                  }

                  if (~(var3 - -this.field7348) <= ~this.field7341.length) {
                     return;
                  }
               }

               do {
                  if (this.field7345[var3] == null && this.field7343.method2690(this.field7341[this.field7348 + var3], 0, 127)) {
                     this.field7345[var3] = this.field7343.method2697(0, this.field7341[this.field7348 - -var3], false);
                  }

                  ++var3;
                  if (var3 >= 10) {
                     return;
                  }
               } while(~(var3 - -this.field7348) > ~this.field7341.length);

            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7351[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Z"
   )
   public static final boolean method3923(String arg0, Class arg1, int arg2) {
      try {
         ++field7344;
         Class var3 = (Class)class728.field10624.get(arg0);
         if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
         } else {
            File var4 = null;
            int var5 = -116 % ((-37 - arg2) / 34);
            if (var4 == null) {
               var4 = (File)class159.field2036.get(arg0);
            }

            if (var4 != null) {
               try {
                  var4 = new File(var4.getCanonicalPath());
                  Class var6 = Class.forName(field7351[0]);
                  Class var7 = Class.forName(field7351[2]);
                  Method var8 = var7.getDeclaredMethod(field7351[9], Boolean.TYPE);
                  Method var9 = var6.getDeclaredMethod(field7351[1], Class.forName(field7351[8]), Class.forName(field7351[4]));
                  var8.invoke(var9, Boolean.TRUE);
                  var9.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                  var8.invoke(var9, Boolean.FALSE);
                  class728.field10624.put(arg0, arg1);
                  return true;
               } catch (NoSuchMethodException var11) {
                  System.load(var4.getPath());
                  class728.field10624.put(arg0, field7350 != null ? field7350 : (field7350 = method3924(field7351[3])));
                  return true;
               } catch (Throwable var12) {
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field7351[5] + (arg0 != null ? field7351[7] : field7351[6]) + ',' + (arg1 != null ? field7351[7] : field7351[6]) + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3924(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3925(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3926(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class625 extends class305 {
   @OriginalMember(
      owner = "client!re",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9106 = new String[]{method4584(method4583("\u0006\u0007_\u0005;")), method4584(method4583("\u0006\u0007_\f;")), method4584(method4583("\u0006\u0007_\u000b;")), method4584(method4583("\u0006\u0007_\u000f;")), method4584(method4583("\u001a\u0017\u001d!")), method4584(method4583("\u000fL_cn")), method4584(method4583("\u0006\u0007_\u000e;")), method4584(method4583("\u0006\u0007_\n;")), method4584(method4583("\u0006\u0007_\u0004;")), method4584(method4583("\u0006\u0007_\t;")), method4584(method4583("\u0006\u0007_\b;"))};
   @OriginalMember(
      owner = "client!re",
      name = "x",
      descriptor = "I"
   )
   public static int field9093;
   @OriginalMember(
      owner = "client!re",
      name = "v",
      descriptor = "I"
   )
   public static int field9094;
   @OriginalMember(
      owner = "client!re",
      name = "E",
      descriptor = "I"
   )
   public static int field9096;
   @OriginalMember(
      owner = "client!re",
      name = "y",
      descriptor = "I"
   )
   public static int field9100;
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "I"
   )
   public static int field9101;
   @OriginalMember(
      owner = "client!re",
      name = "B",
      descriptor = "I"
   )
   public static int field9102;
   @OriginalMember(
      owner = "client!re",
      name = "F",
      descriptor = "I"
   )
   public static int field9103;
   @OriginalMember(
      owner = "client!re",
      name = "K",
      descriptor = "I"
   )
   public static int field9105;
   @OriginalMember(
      owner = "client!re",
      name = "D",
      descriptor = "Lha;"
   )
   public static class65 field9095;
   @OriginalMember(
      owner = "client!re",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public String field9092;
   @OriginalMember(
      owner = "client!re",
      name = "w",
      descriptor = "[C"
   )
   public char[] field9099;
   @OriginalMember(
      owner = "client!re",
      name = "H",
      descriptor = "[C"
   )
   public char[] field9104;
   @OriginalMember(
      owner = "client!re",
      name = "J",
      descriptor = "[I"
   )
   public int[] field9097;
   @OriginalMember(
      owner = "client!re",
      name = "I",
      descriptor = "[I"
   )
   public int[] field9098;

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method4574(class65 arg0, int arg1) {
      try {
         label27: {
            if (class442.field6452) {
               class586.method4342(16711935, arg0);
               if (!client.field4564) {
                  break label27;
               }
            }

            class116.method1109(99, arg0);
         }

         if (arg1 != -16711936) {
            field9095 = null;
         }

         ++field9100;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9106[9] + (arg0 != null ? field9106[5] : field9106[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4575(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (this.field9098 != null) {
            int var3 = 0;
            if (var2 || this.field9098.length > var3) {
               do {
                  this.field9098[var3] = class93.method899(this.field9098[var3], 32768);
                  ++var3;
               } while(this.field9098.length > var3);
            }
         }

         ++field9101;
         if (this.field9097 != null) {
            int var4 = 0;
            if (var2 || this.field9097.length > var4) {
               do {
                  this.field9097[var4] = class93.method899(this.field9097[var4], 32768);
                  ++var4;
               } while(this.field9097.length > var4);
            }
         }

         if (arg0 != 32768) {
            method4581(-88, 81, 8);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9106[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ZLuda;)V"
   )
   public final void method4576(boolean arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg1.method3564((byte)-58);
            if (var4 != 0) {
               this.method4578(79, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field9105;
            break;
         }

         if (arg0) {
            this.field9099 = null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9106[6] + arg0 + ',' + (arg1 != null ? field9106[5] : field9106[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4577(int arg0) {
      try {
         field9095 = null;
         if (arg0 != 0) {
            field9095 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9106[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ILuda;I)V"
   )
   private final void method4578(int param1, class473 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(CI)I"
   )
   public final int method4579(char arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 14899) {
            this.field9104 = null;
         }

         ++field9093;
         if (this.field9098 == null) {
            return -1;
         } else {
            int var4 = 0;
            if (var3) {
               if (~arg0 == ~this.field9104[var4]) {
                  return this.field9098[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~this.field9098.length >= ~var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg0;
               }

               if (var10000 == ~this.field9104[var4]) {
                  return this.field9098[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9106[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(CB)I"
   )
   public final int method4580(char arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field9103;
         if (this.field9097 == null) {
            return -1;
         } else if (arg1 != 77) {
            return 56;
         } else {
            int var4 = 0;
            int var10000;
            if (var3) {
               var10000 = ~arg0;
            } else if (this.field9097.length <= var4) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = ~arg0;
            }

            while(var10000 != ~this.field9099[var4]) {
               ++var4;
               if (this.field9097.length <= var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg0;
               }
            }

            return this.field9097[var4];
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9106[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4581(int arg0, int arg1, int arg2) {
      try {
         ++field9102;
         int var3 = arg0 >>> 24;
         int var4 = -var3 + arg1;
         int var7 = ((arg0 & 16711935) * var3 & -16711936 | (65280 & arg0) * var3 & 16711680) >>> 8;
         return (((16711935 & arg2) * var4 & -16711936 | 16711680 & (65280 & arg2) * var4) >>> 8) + var7;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9106[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(IIZ)Lbv;"
   )
   public static final class321 method4582(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4564;

      try {
         ++field9094;
         class150[] var4 = class732.field10529;
         synchronized(class732.field10529) {
            class321 var5;
            label69: {
               if (arg0 >= class732.field10529.length || class732.field10529[arg0].method1402(false)) {
                  var5 = new class321();
                  var5.field4630 = new class362[arg0];
                  int var6 = 0;
                  if (var3) {
                     var5.field4630[var6] = new class362();
                     ++var6;
                  }

                  while(true) {
                     while(var6 < arg0) {
                        var5.field4630[var6] = new class362();
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label69;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               var5 = (class321)class732.field10529[arg0].method1403((byte)35);
               var5.method1995((byte)35);
               int var10002 = class497.field7271[arg0]--;
            }

            if (arg1 != 0) {
               return null;
            } else {
               var5.field4622 = arg2;
               return var5;
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field9106[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4583(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4584(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class614 {
   @OriginalMember(
      owner = "client!lk",
      name = "k",
      descriptor = "I"
   )
   public int field9020 = 2048;
   @OriginalMember(
      owner = "client!lk",
      name = "l",
      descriptor = "I"
   )
   public int field9027 = 2048;
   @OriginalMember(
      owner = "client!lk",
      name = "d",
      descriptor = "I"
   )
   public int field9029 = 0;
   @OriginalMember(
      owner = "client!lk",
      name = "g",
      descriptor = "I"
   )
   public int field9026 = 0;
   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9030 = new String[]{method4467(method4466("X3\u0001\u0019[")), method4467(method4466("X3\u0001\u001b[")), method4467(method4466("Ov\u0001t\u000e")), method4467(method4466("X3\u0001\u0018[")), method4467(method4466("Z-C6")), method4467(method4466("X3\u0001\u001f[")), method4467(method4466("X3\u0001\u001e["))};
   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "I"
   )
   public static int field9019 = 328;
   @OriginalMember(
      owner = "client!lk",
      name = "h",
      descriptor = "Lqea;"
   )
   public static class139 field9022 = new class139();
   @OriginalMember(
      owner = "client!lk",
      name = "i",
      descriptor = "I"
   )
   public static int field9018;
   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "I"
   )
   public static int field9021;
   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "I"
   )
   public static int field9023;
   @OriginalMember(
      owner = "client!lk",
      name = "f",
      descriptor = "I"
   )
   public static int field9024;
   @OriginalMember(
      owner = "client!lk",
      name = "j",
      descriptor = "I"
   )
   public static int field9025;
   @OriginalMember(
      owner = "client!lk",
      name = "e",
      descriptor = "I"
   )
   public static int field9028;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method4461(byte arg0) {
      try {
         field9022 = null;
         if (arg0 != 40) {
            method4461((byte)16);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9030[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ZII)I",
      line = 17
   )
   public static final int method4462(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field9021;
         int var4 = 1;
         if (var3) {
            if (~(1 & arg1) != -1) {
               var4 = arg2 * var4;
            }

            arg2 *= arg2;
            arg1 >>= 1;
         }

         while(true) {
            int var10000;
            byte var10001;
            if (~arg1 >= -2) {
               var10000 = arg0;
               var10001 = 1;
               if (!var3) {
                  if (arg0 != 1) {
                     method4462(true, 57, -97);
                  }

                  if (arg1 == 1) {
                     return arg2 * var4;
                  }

                  return var4;
               }
            } else {
               var10000 = ~(1 & arg1);
               var10001 = -1;
            }

            if (var10000 != var10001) {
               var4 = arg2 * var4;
            }

            arg2 *= arg2;
            arg1 >>= 1;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9030[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 52
   )
   private final void method4463(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label53: {
            if (~arg2 == -2) {
               this.field9026 = arg1.method1143(arg0 + -15478);
               if (!var4) {
                  break label53;
               }
            }

            if (~arg2 == -3) {
               this.field9020 = arg1.method1211(-26166);
               if (!var4) {
                  break label53;
               }
            }

            if (~arg2 != -4) {
               if (arg2 != 4) {
                  break label53;
               }

               this.field9029 = arg1.method1187((byte)65);
               if (!var4) {
                  break label53;
               }
            }

            this.field9027 = arg1.method1211(-26166);
         }

         if (arg0 == 13) {
            ++field9018;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9030[6] + arg0 + ',' + (arg1 != null ? field9030[2] : field9030[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(I)V",
      line = 87
   )
   public static final void method4464(int arg0) {
      boolean var1 = client.field4360;

      try {
         label45: {
            int var2 = -95 / ((arg0 - 46) / 53);
            if (!class596.method4331(class622.field9156, (byte)-117)) {
               if (class622.field9156 == 5 || ~class622.field9156 == -7) {
                  class731.method5321(3, (byte)-102);
                  if (!var1) {
                     break label45;
                  }
               }

               if (class622.field9156 != 13) {
                  break label45;
               }

               class731.method5321(3, (byte)-98);
               if (!var1) {
                  break label45;
               }
            }

            if (class430.field6143.field102 == null) {
               class731.method5321(5, (byte)-105);
               if (!var1) {
                  break label45;
               }
            }

            class731.method5321(7, (byte)-112);
         }

         ++field9028;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9030[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 132
   )
   public final void method4465(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         ++field9024;

         while(true) {
            int var4 = arg1.method1143(arg0 ^ -15465);
            if (var4 != 0) {
               this.method4463(arg0 + 13, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != 0) {
               field9025 = 6;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9030[3] + arg0 + ',' + (arg1 != null ? field9030[2] : field9030[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4466(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4467(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

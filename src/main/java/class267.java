import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class267 implements class680 {
   @OriginalMember(
      owner = "client!nca",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private String field4083;
   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4085 = new String[]{method2287(method2286("'\u0003LZ\fa")), method2287(method2286("'\u0015A\u0018")), method2287(method2286("2N\u0003Z7")), method2287(method2286("'\u0003LZ\ba")), method2287(method2286("'\u0003LZ\u000ea")), method2287(method2286("'\u0003LZ\u000fa")), method2287(method2286("'\u0003LZv \u000eD\u0000ta")), method2287(method2286("'\u0003LZ\ta")), method2287(method2286("'\u0003LZ\u000ba")), method2287(method2286("'\u0003LZ\ra"))};
   @OriginalMember(
      owner = "client!nca",
      name = "f",
      descriptor = "I"
   )
   public static int field4075;
   @OriginalMember(
      owner = "client!nca",
      name = "j",
      descriptor = "I"
   )
   public static int field4076;
   @OriginalMember(
      owner = "client!nca",
      name = "e",
      descriptor = "I"
   )
   public static int field4077;
   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "I"
   )
   public static int field4079;
   @OriginalMember(
      owner = "client!nca",
      name = "c",
      descriptor = "I"
   )
   public static int field4080;
   @OriginalMember(
      owner = "client!nca",
      name = "i",
      descriptor = "I"
   )
   public static int field4081;
   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "I"
   )
   public static int field4084;
   @OriginalMember(
      owner = "client!nca",
      name = "h",
      descriptor = "Z"
   )
   private boolean field4078;
   @OriginalMember(
      owner = "client!nca",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field4082;

   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2281(int arg0) {
      try {
         label20: {
            if (~class412.field6049 >= -2) {
               class476.field6870.method4707(2, false, class476.field6870.field9115);
               if (!client.field10022) {
                  break label20;
               }
            }

            class476.field6870.method4707(4, false, class476.field6870.field9115);
         }

         if (arg0 != 2) {
            method2283(-112);
         }

         ++field4076;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4085[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(Lwba;I)V"
   )
   public static final void method2282(class731 arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4075;
         arg0.field10399 = null;
         int var3 = arg0.field10397.length;
         if (arg1 == -7073) {
            int var4 = 0;
            if (var2) {
               arg0.field10397[var4].field3053 = false;
               ++var4;
            }

            while(true) {
               while(var3 > var4) {
                  arg0.field10397[var4].field3053 = false;
                  ++var4;
               }

               class424[] var5 = class510.field7239;
               synchronized(class510.field7239) {
                  if (!var2) {
                     if (class510.field7239.length > var3 && class321.field4792[var3] < 200) {
                        class510.field7239[var3].method3310(arg1 + 7073, arg0);
                        int var10002 = class321.field4792[var3]++;
                     }

                     return;
                  }
               }

               ++var4;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4085[5] + (arg0 != null ? field4085[2] : field4085[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2283(int arg0) {
      try {
         if (arg0 != 2) {
            method2285(-8, -5, false, 121, (class39)null, 61, 26);
         }

         field4082 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4085[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2284(byte arg0) {
      try {
         if (arg0 >= -35) {
            field4082 = null;
         }

         ++field4084;
         return this.field4078;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4085[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(B)Leo;"
   )
   public final class344 method1760(byte arg0) {
      try {
         if (arg0 != 54) {
            return null;
         } else {
            ++field4080;
            return class344.field5066;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4085[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(IIZILsa;II)V"
   )
   public static final void method2285(int arg0, int arg1, boolean arg2, int arg3, class39 arg4, int arg5, int arg6) {
      try {
         label30: {
            if (~arg3 >= -1) {
               class504.method3804(arg0, arg2, arg1, arg4, arg5, (byte)-117);
               if (!client.field10022) {
                  break label30;
               }
            }

            class681.field9845 = arg1;
            class790.field11504 = arg5;
            class438.field6424 = arg0;
            class705.field10146 = arg2;
            class778.field11344 = null;
            class487.field6949 = 1;
            class563.field8019 = arg4;
            class10.field165 = class691.field9950.method1166(-92) / arg3;
            if (class10.field165 < 1) {
               class10.field165 = 1;
            }
         }

         ++field4077;
         if (arg6 != 4789) {
            method2282((class731)null, -72);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4085[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4085[2] : field4085[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class267(String arg0) {
      try {
         this.field4083 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4085[6] + (arg0 != null ? field4085[2] : field4085[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1763(byte arg0) {
      try {
         ++field4079;
         int var2 = class619.method4564(this.field4083, 2);
         if (~var2 <= -1 && ~var2 >= -101) {
            return var2;
         } else {
            if (arg0 >= -66) {
               this.field4078 = true;
            }

            this.field4078 = true;
            return 100;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4085[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2286(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2287(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

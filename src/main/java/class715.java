import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class715 extends class557 {
   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10258 = new String[]{method5185(method5184("(wMZl")), method5185(method5184("(wM[l")), method5185(method5184("(wM\\l")), method5185(method5184("(wM^l")), method5185(method5184("(wM_l")), method5185(method5184("(wMRl")), method5185(method5184("!e\u000ft")), method5185(method5184("(wMYl")), method5185(method5184("\u0007y\u0007|!!=")), method5185(method5184("4>M69"))};
   @OriginalMember(
      owner = "client!gg",
      name = "o",
      descriptor = "I"
   )
   public static int field10252 = 0;
   @OriginalMember(
      owner = "client!gg",
      name = "j",
      descriptor = "I"
   )
   public static int field10250;
   @OriginalMember(
      owner = "client!gg",
      name = "n",
      descriptor = "I"
   )
   public static int field10251;
   @OriginalMember(
      owner = "client!gg",
      name = "h",
      descriptor = "I"
   )
   public static int field10253;
   @OriginalMember(
      owner = "client!gg",
      name = "k",
      descriptor = "I"
   )
   public static int field10254;
   @OriginalMember(
      owner = "client!gg",
      name = "i",
      descriptor = "I"
   )
   public static int field10255;
   @OriginalMember(
      owner = "client!gg",
      name = "m",
      descriptor = "I"
   )
   public static int field10256;
   @OriginalMember(
      owner = "client!gg",
      name = "l",
      descriptor = "I"
   )
   public static int field10257;

   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5181(int arg0) {
      try {
         ++field10251;
         if (arg0 >= -52) {
            method5182(-57, 86);
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10258[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "(II)Lua;"
   )
   public static final class569 method5182(int arg0, int arg1) {
      try {
         ++field10250;
         if (arg1 != -3) {
            method5182(-7, 95);
         }

         if (~arg0 != -1) {
            if (~arg0 != -2) {
               if (~arg0 == -3) {
                  if ((double)class651.field9216 == 3.0D) {
                     return class365.field5414;
                  }

                  if ((double)class651.field9216 == 4.0D) {
                     return class227.field3527;
                  }

                  if ((double)class651.field9216 == 6.0D) {
                     return class259.field3963;
                  }

                  if ((double)class651.field9216 >= 8.0D) {
                     return class768.field11027;
                  }
               }
            } else {
               if ((double)class651.field9216 == 3.0D) {
                  return class84.field1304;
               }

               if ((double)class651.field9216 == 4.0D) {
                  return class598.field8417;
               }

               if ((double)class651.field9216 == 6.0D) {
                  return class365.field5414;
               }

               if ((double)class651.field9216 >= 8.0D) {
                  return class227.field3527;
               }
            }
         } else {
            if ((double)class651.field9216 == 3.0D) {
               return class274.field4173;
            }

            if ((double)class651.field9216 == 4.0D) {
               return class168.field2518;
            }

            if ((double)class651.field9216 == 6.0D) {
               return class84.field1304;
            }

            if ((double)class651.field9216 >= 8.0D) {
               return class598.field8417;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10258[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class715(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field10257;
         if (arg0 == -22) {
            if (super.field7906.method4715((byte)-107) == class122.field1967) {
               super.field7905 = 2;
            }

            if (super.field7905 < 0 || super.field7905 > 2) {
               super.field7905 = this.method97(arg0 ^ -22);
            }

         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10258[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class715(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IILjga;)Ljava/lang/String;"
   )
   public static final String method5183(int arg0, int arg1, class91 arg2) {
      try {
         ++field10256;
         if (!client.method5048(arg2).method3241(arg1, -15719) && arg2.field1481 == null) {
            return null;
         } else if (arg2.field1397 != null && arg2.field1397.length > arg1 && arg2.field1397[arg1] != null && ~arg2.field1397[arg1].trim().length() != -1) {
            return arg0 != 18139 ? null : arg2.field1397[arg1];
         } else {
            return class34.field514 ? field10258[8] + arg1 : null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10258[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10258[9] : field10258[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field10255;
         if (!arg1) {
            this.method92(92, -93);
         }

         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10258[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            return 95;
         } else {
            ++field10254;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10258[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            return -6;
         } else {
            ++field10253;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10258[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5184(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5185(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

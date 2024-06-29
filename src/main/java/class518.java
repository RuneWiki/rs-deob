import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class518 {
   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7894 = new String[]{method4005(method4004("\u001b%zF\u0004&-k\u0016364nF`62iY2i")), method4005(method4004("9!mW8}-zX!4%vS.'nVt%2.HS2%%iu/=.~U4:/u")), method4005(method4004("9!mWn?!uQn>!uW'6-~X4}\rzX!4%vS.'\u0006zU4<2b")), method4005(method4004("9!mWn?!uQn\u0010,zE3")), method4005(method4004("9#z\u0018\u0003{")), method4005(method4004("4%of,24}Y2>\rYS!=\u0013~D662")), method4005(method4004("9!mWn?!uQn\u00004i_.4")), method4005(method4004("0/v\u00183&.5[!=!|S-6.o\f4*0~\u000b\b<4HF/'\u0004rW'=/hB)0")), method4005(method4004("0/v\u00183&.5[!=!|S-6.o\u0018\b<4HF/'\u0004rW'=/hB)0\rCt%2.")), method4005(method4004("=%lf,24}Y2>\rCt%2.KD/+9")), method4005(method4004("9#z\u0018\u0002{")), method4005(method4004("9#z\u0018\u0001{")), method4005(method4004("=5wZ")), method4005(method4004("(n5\u0018=")), method4005(method4004("9#z\u0018\u0004{")), method4005(method4004("9#z\u0018\u0005{"))};
   @OriginalMember(
      owner = "client!jca",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field7891 = null;
   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "I"
   )
   public static int field7887;
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "I"
   )
   public static int field7888;
   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "I"
   )
   public static int field7889;
   @OriginalMember(
      owner = "client!jca",
      name = "e",
      descriptor = "I"
   )
   public static int field7890;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7892;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jca",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7893;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4003(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static final synchronized void method3998(int arg0) {
      try {
         ++field7890;
         if (class680.field10145 == null) {
            try {
               Class var1 = Class.forName(field7894[2]);
               Method var2 = var1.getDeclaredMethod(field7894[5], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               if (arg0 == -203) {
                  Method var4 = var1.getMethod(field7894[9], Class.forName(field7894[1]), field7892 != null ? field7892 : (field7892 = method4003(field7894[6])), field7893 != null ? field7893 : (field7893 = method4003(field7894[3])));
                  class680.field10145 = var4.invoke((Object)null, var3, field7894[7], Class.forName(field7894[8]));
               }
            } catch (Exception var7) {
               System.out.println(field7894[0]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7894[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(B)V",
      line = 40
   )
   public static void method3999(byte arg0) {
      try {
         if (arg0 != -86) {
            field7891 = null;
         }

         field7891 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7894[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(CI)C",
      line = 50
   )
   public static final char method4000(char arg0, int arg1) {
      try {
         ++field7888;
         int var2 = 45 / ((68 - arg1) / 44);
         if (~arg0 != -33 && ~arg0 != -161 && ~arg0 != -96 && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && arg0 != '#') {
               if (~arg0 != -225 && ~arg0 != -226 && arg0 != 226 && arg0 != 228 && ~arg0 != -228 && arg0 != 192 && ~arg0 != -194 && ~arg0 != -195 && arg0 != 196 && ~arg0 != -196) {
                  if (arg0 != 232 && ~arg0 != -234 && ~arg0 != -235 && arg0 != 235 && ~arg0 != -201 && ~arg0 != -202 && ~arg0 != -203 && arg0 != 203) {
                     if (arg0 != 237 && arg0 != 238 && arg0 != 239 && ~arg0 != -206 && ~arg0 != -207 && ~arg0 != -208) {
                        if (arg0 != 242 && ~arg0 != -244 && ~arg0 != -245 && arg0 != 246 && ~arg0 != -246 && ~arg0 != -211 && arg0 != 211 && arg0 != 212 && ~arg0 != -215 && ~arg0 != -214) {
                           if (~arg0 != -250 && ~arg0 != -251 && ~arg0 != -252 && arg0 != 252 && ~arg0 != -218 && ~arg0 != -219 && arg0 != 219 && ~arg0 != -221) {
                              if (arg0 != 231 && ~arg0 != -200) {
                                 if (~arg0 != -256 && ~arg0 != -377) {
                                    if (arg0 != 241 && ~arg0 != -210) {
                                       if (~arg0 != -224) {
                                          return Character.toLowerCase(arg0);
                                       } else if (!client.field1786) {
                                          return 'b';
                                       } else {
                                          return '_';
                                       }
                                    } else {
                                       return 'n';
                                    }
                                 } else {
                                    return 'y';
                                 }
                              } else {
                                 return 'c';
                              }
                           } else {
                              return 'u';
                           }
                        } else {
                           return 'o';
                        }
                     } else {
                        return 'i';
                     }
                  } else {
                     return 'e';
                  }
               } else {
                  return 'a';
               }
            } else {
               return arg0;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7894[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(Lica;I)Lcn;",
      line = 445
   )
   public static final class590 method4001(class354 arg0, int arg1) {
      try {
         ++field7889;
         if (arg1 > -14) {
            method4001((class354)null, -49);
         }

         return new class590(arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2872(2), arg0.method2872(2), arg0.method2855(-31007));
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7894[11] + (arg0 != null ? field7894[13] : field7894[12]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "(B)V",
      line = 456
   )
   public static final void method4002(byte arg0) {
      try {
         class69.method532(1, 12);
         int var1 = 72 / ((-12 - arg0) / 45);
         ++field7887;
         class628.method4599(-82);
         System.gc();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7894[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

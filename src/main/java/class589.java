import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class589 extends class500 {
   @OriginalMember(
      owner = "client!si",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8127 = new String[]{method4232(method4231("%p\u0012n+")), method4232(method4231("%p\u0012l+")), method4232(method4231("-7\u0012\u0003~")), method4232(method4231("%p\u0012o+")), method4232(method4231("8lPA"))};
   @OriginalMember(
      owner = "client!si",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8115 = new int[2];
   @OriginalMember(
      owner = "client!si",
      name = "p",
      descriptor = "I"
   )
   public static int field8118 = -1;
   @OriginalMember(
      owner = "client!si",
      name = "r",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8125 = new String[100];
   @OriginalMember(
      owner = "client!si",
      name = "o",
      descriptor = "F"
   )
   public static float field8119;
   @OriginalMember(
      owner = "client!si",
      name = "l",
      descriptor = "I"
   )
   public int field8109;
   @OriginalMember(
      owner = "client!si",
      name = "v",
      descriptor = "I"
   )
   public static int field8111;
   @OriginalMember(
      owner = "client!si",
      name = "y",
      descriptor = "I"
   )
   public int field8112;
   @OriginalMember(
      owner = "client!si",
      name = "x",
      descriptor = "I"
   )
   public int field8114;
   @OriginalMember(
      owner = "client!si",
      name = "s",
      descriptor = "I"
   )
   public int field8117;
   @OriginalMember(
      owner = "client!si",
      name = "w",
      descriptor = "I"
   )
   public int field8120;
   @OriginalMember(
      owner = "client!si",
      name = "j",
      descriptor = "I"
   )
   public static int field8122;
   @OriginalMember(
      owner = "client!si",
      name = "t",
      descriptor = "I"
   )
   public int field8126;
   @OriginalMember(
      owner = "client!si",
      name = "u",
      descriptor = "Leb;"
   )
   public class657 field8110;
   @OriginalMember(
      owner = "client!si",
      name = "n",
      descriptor = "Leb;"
   )
   public class657 field8124;
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field8121;
   @OriginalMember(
      owner = "client!si",
      name = "q",
      descriptor = "Z"
   )
   public boolean field8113;
   @OriginalMember(
      owner = "client!si",
      name = "A",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field8116;
   @OriginalMember(
      owner = "client!si",
      name = "m",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8123;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(IIIIII)Z"
   )
   public static final boolean method4228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field8111;
         int var7 = arg0;
         int var10000;
         if (var6) {
            var10000 = arg2;
         } else if (arg0 > arg5) {
            var10000 = arg1;
            if (!var6) {
               if (arg1 != 1) {
                  field8115 = null;
               }

               return false;
            }
         } else {
            var10000 = arg2;
         }

         while(true) {
            int var8 = var10000;
            if (var6) {
               if (class371.field5227[var7][var8] == arg3 && class752.field10919[var7][var8] <= 1) {
                  return true;
               }

               ++var8;
            }

            while(true) {
               while(arg4 >= var8) {
                  if (class371.field5227[var7][var8] == arg3 && class752.field10919[var7][var8] <= 1) {
                     return true;
                  }

                  ++var8;
               }

               if (!var6) {
                  ++var7;
                  if (var7 > arg5) {
                     var10000 = arg1;
                     if (!var6) {
                        if (arg1 != 1) {
                           field8115 = null;
                        }

                        return false;
                     }
                  } else {
                     var10000 = arg2;
                  }
                  break;
               }

               ++var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8127[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4229(int arg0) {
      try {
         field8123 = null;
         field8125 = null;
         if (arg0 == -1) {
            field8115 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8127[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method4230(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8122;
         if (arg1 != null) {
            String var3 = class14.method110(true, arg1);
            if (var3 != null) {
               if (arg0 != 1) {
                  method4229(30);
               }

               int var4 = 0;
               if (var2 || ~var4 > ~class209.field2582) {
                  do {
                     String var5 = class125.field1560[var4];
                     String var6 = class14.method110(true, var5);
                     if (class141.method1207(var3, var6, var5, arg1, true)) {
                        --class209.field2582;
                        int var7 = var4;
                        if (var2) {
                           class125.field1560[var4] = class125.field1560[var4 + 1];
                           class257.field3286[var4] = class257.field3286[var4 - -1];
                           class450.field6218[var4] = class450.field6218[var4 + 1];
                           class150.field1962[var4] = class150.field1962[var4 + 1];
                           class386.field5410[var4] = class386.field5410[var4 + 1];
                           class383.field5365[var4] = class383.field5365[var4 - -1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(~var7 > ~class209.field2582) {
                              class125.field1560[var7] = class125.field1560[var7 + 1];
                              class257.field3286[var7] = class257.field3286[var7 - -1];
                              class450.field6218[var7] = class450.field6218[var7 + 1];
                              class150.field1962[var7] = class150.field1962[var7 + 1];
                              class386.field5410[var7] = class386.field5410[var7 + 1];
                              class383.field5365[var7] = class383.field5365[var7 - -1];
                              ++var7;
                           }

                           class667.field9490 = class350.field5018;
                           ++class231.field2875;
                           class223 var8 = class355.method2790(arg0 ^ 13110);
                           class471 var9 = class133.method1118(var8.field2787, 2, class93.field1239);
                           var9.field6527.method4318(class190.method1432(arg0 ^ 10525, arg1), 0);
                           var9.field6527.method4332((byte)-94, arg1);
                           var8.method1702((byte)-124, var9);
                           if (!var2) {
                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var4;
                  } while(~var4 > ~class209.field2582);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field8127[3] + arg0 + ',' + (arg1 != null ? field8127[2] : field8127[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4231(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4232(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class239 {
   @OriginalMember(
      owner = "client!rt",
      name = "d",
      descriptor = "I"
   )
   public int field2966 = 128;
   @OriginalMember(
      owner = "client!rt",
      name = "e",
      descriptor = "I"
   )
   public int field2979 = 128;
   @OriginalMember(
      owner = "client!rt",
      name = "p",
      descriptor = "I"
   )
   public int field2969;
   @OriginalMember(
      owner = "client!rt",
      name = "o",
      descriptor = "I"
   )
   public int field2965;
   @OriginalMember(
      owner = "client!rt",
      name = "n",
      descriptor = "I"
   )
   public int field2971;
   @OriginalMember(
      owner = "client!rt",
      name = "j",
      descriptor = "I"
   )
   public int field2973;
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2983 = new String[]{method1797(method1796("\u001c1Z/j")), method1797(method1796("\u001c1ZR+\u0000,\u0000Pj")), method1797(method1796("\u001c1Z+j")), method1797(method1796("\u001c1Z*j")), method1797(method1796("\u00000\u0018\u0002")), method1797(method1796("\u0015kZ@?")), method1797(method1796("\u001c1Z,j")), method1797(method1796("\u001c1Z)j")), method1797(method1796("\u001c1Z-j"))};
   @OriginalMember(
      owner = "client!rt",
      name = "k",
      descriptor = "Lbga;"
   )
   public static class378 field2970 = new class378(6, 12);
   @OriginalMember(
      owner = "client!rt",
      name = "t",
      descriptor = "I"
   )
   public static int field2980 = 0;
   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "I"
   )
   public static int field2963;
   @OriginalMember(
      owner = "client!rt",
      name = "h",
      descriptor = "I"
   )
   public int field2964;
   @OriginalMember(
      owner = "client!rt",
      name = "f",
      descriptor = "I"
   )
   public static int field2967;
   @OriginalMember(
      owner = "client!rt",
      name = "m",
      descriptor = "I"
   )
   public int field2968;
   @OriginalMember(
      owner = "client!rt",
      name = "s",
      descriptor = "I"
   )
   public int field2972;
   @OriginalMember(
      owner = "client!rt",
      name = "i",
      descriptor = "I"
   )
   public int field2974;
   @OriginalMember(
      owner = "client!rt",
      name = "q",
      descriptor = "I"
   )
   public int field2975;
   @OriginalMember(
      owner = "client!rt",
      name = "g",
      descriptor = "I"
   )
   public static int field2976;
   @OriginalMember(
      owner = "client!rt",
      name = "r",
      descriptor = "I"
   )
   public static int field2977;
   @OriginalMember(
      owner = "client!rt",
      name = "l",
      descriptor = "I"
   )
   public static int field2978;
   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "I"
   )
   public static int field2981;
   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field2982;

   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "(I)Lrt;"
   )
   public final class239 method1789(int arg0) {
      try {
         if (arg0 != -15621) {
            method1790(93);
         }

         ++field2976;
         return new class239(this.field2969, this.field2979, this.field2966, this.field2965, this.field2973, this.field2971);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2983[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1790(int arg0) {
      try {
         ++field2977;
         if (class221.field2764) {
            class657 var1 = class728.method5295(class593.field8208, class226.field2837, -1);
            if (var1 != null && var1.field9250 != null) {
               class589 var2 = new class589();
               var2.field8110 = var1;
               var2.field8116 = var1.field9250;
               class16.method121(var2);
            }

            class325.field4354 = -1;
            class110.field1389 = -1;
            if (arg0 > 0) {
               class221.field2764 = false;
               if (var1 != null) {
                  class383.method2943(false, var1);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2983[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lrt;I)V"
   )
   public final void method1791(class239 arg0, int arg1) {
      try {
         this.field2971 = arg0.field2971;
         this.field2966 = arg0.field2966;
         ++field2963;
         this.field2979 = arg0.field2979;
         this.field2973 = arg0.field2973;
         this.field2969 = arg0.field2969;
         this.field2965 = arg0.field2965;
         int var3 = 34 / ((arg1 - 1) / 41);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2983[3] + (arg0 != null ? field2983[5] : field2983[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lbt;Z)Z"
   )
   public static final boolean method1792(class47 arg0, boolean arg1) {
      boolean var2 = class93.field1241 == class73.field900;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method398(-127);
      if (arg0.field547 >= 0 && arg0.field540 >= 0 && arg0.field548 < class635.field8973 && arg0.field541 < class304.field4042) {
         short var6 = 0;

         for(int var7 = arg0.field547; var7 <= arg0.field548; ++var7) {
            for(int var11 = arg0.field540; var11 <= arg0.field541; ++var11) {
               class225 var12 = class12.method96(arg0.field1001, var7, var11);
               if (var12 != null) {
                  class752 var13 = class369.method2848((byte)-89, arg0);
                  class752 var14 = var12.field2821;
                  if (var14 == null) {
                     var12.field2821 = var13;
                  } else {
                     while(var14.field10923 != null) {
                        var14 = var14.field10923;
                     }

                     var14.field10923 = var13;
                  }

                  if (var2 && (class175.field2177[var7][var11] & -16777216) != 0) {
                     var3 = class175.field2177[var7][var11];
                     var4 = class584.field8014[var7][var11];
                     var5 = class350.field5017[var7][var11];
                  }

                  if (!arg1 && var12.field2820 != null && var12.field2820.field7186 > var6) {
                     var6 = var12.field2820.field7186;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field547; var8 <= arg0.field548; ++var8) {
               for(int var9 = arg0.field540; var9 <= arg0.field541; ++var9) {
                  if ((class175.field2177[var8][var9] & -16777216) == 0) {
                     class175.field2177[var8][var9] = var3;
                     class584.field8014[var8][var9] = var4;
                     class350.field5017[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class422.field5939[class450.field6222++] = arg0;
         } else {
            int var10 = class93.field1241 == class73.field900 ? 1 : 0;
            if (arg0.method780(9)) {
               if (arg0.method775(0)) {
                  arg0.field1004 = class735.field10736[var10];
                  class735.field10736[var10] = arg0;
               } else {
                  arg0.field1004 = class8.field111[var10];
                  class8.field111[var10] = arg0;
                  class591.field8180 = true;
               }
            } else {
               arg0.field1004 = class234.field2900[var10];
               class234.field2900[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field998 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1793(int arg0) {
      try {
         field2982 = null;
         field2970 = null;
         if (arg0 > -28) {
            method1795(70);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2983[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method1794(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2967;
         if (class233.field2888 && class480.field6633) {
            if (class111.field1406 < 100) {
               return false;
            } else if (!class486.method3534(arg1, arg3, -17319, arg0)) {
               return false;
            } else {
               int var5 = arg1 << class76.field965;
               if (arg4 != -14401) {
                  return false;
               } else {
                  int var6 = arg3 << class76.field965;
                  if (class692.method5032(class93.field1241[arg0].method2221(false, arg3, arg1), class212.field2635, class212.field2635, arg2, var5, 862921836, var6)) {
                     ++class517.field7091;
                     return true;
                  } else {
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2983[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1795(int arg0) {
      try {
         class302.field4001 = null;
         class126.field1572 = null;
         class599.field8362 = null;
         class633.field8958 = null;
         class681.field9996 = -1;
         class596.field8300 = -1;
         class773.field11148 = null;
         class195.field2370 = null;
         class660.field9417 = -1;
         class616.field8588 = -1;
         ++field2978;
         class771.field11096 = null;
         if (arg0 > 100) {
            class526.field7199.method260(false);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2983[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class239(int arg0) {
      try {
         this.field2969 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2983[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field2965 = arg3;
         this.field2971 = arg5;
         this.field2973 = arg4;
         this.field2966 = arg2;
         this.field2969 = arg0;
         this.field2979 = arg1;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2983[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1796(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1797(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class749 {
   @OriginalMember(
      owner = "client!jga",
      name = "f",
      descriptor = "I"
   )
   public int field10897 = 128;
   @OriginalMember(
      owner = "client!jga",
      name = "k",
      descriptor = "I"
   )
   public int field10900 = 128;
   @OriginalMember(
      owner = "client!jga",
      name = "c",
      descriptor = "I"
   )
   public int field10898;
   @OriginalMember(
      owner = "client!jga",
      name = "m",
      descriptor = "I"
   )
   public int field10889;
   @OriginalMember(
      owner = "client!jga",
      name = "l",
      descriptor = "I"
   )
   public int field10888;
   @OriginalMember(
      owner = "client!jga",
      name = "i",
      descriptor = "I"
   )
   public int field10887;
   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10903 = new String[]{method5417(method5416("\u001fI\u001c}")), method5417(method5416("\u001b[\u0011?$Y")), method5417(method5416("\n\u0012^?\u001c")), method5417(method5416("\u001b[\u0011?'Y")), method5417(method5416("\u001b[\u0011?#Y")), method5417(method5416("\u001b[\u0011?\"Y")), method5417(method5416("\u001b[\u0011?]\u0018R\u0019e_Y")), method5417(method5416("\u001b[\u0011?%Y")), method5417(method5416("\u001b[\u0011? Y")), method5417(method5416("\u001b[\u0011?&Y"))};
   @OriginalMember(
      owner = "client!jga",
      name = "n",
      descriptor = "Lbga;"
   )
   public static class378 field10892 = new class378(21, 6);
   @OriginalMember(
      owner = "client!jga",
      name = "j",
      descriptor = "Lbga;"
   )
   public static class378 field10901 = new class378(86, 0);
   @OriginalMember(
      owner = "client!jga",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field10902 = false;
   @OriginalMember(
      owner = "client!jga",
      name = "e",
      descriptor = "I"
   )
   public static int field10890;
   @OriginalMember(
      owner = "client!jga",
      name = "b",
      descriptor = "I"
   )
   public static int field10891;
   @OriginalMember(
      owner = "client!jga",
      name = "d",
      descriptor = "I"
   )
   public static int field10893;
   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "I"
   )
   public static int field10894;
   @OriginalMember(
      owner = "client!jga",
      name = "h",
      descriptor = "I"
   )
   public static int field10895;
   @OriginalMember(
      owner = "client!jga",
      name = "o",
      descriptor = "I"
   )
   public static int field10896;
   @OriginalMember(
      owner = "client!jga",
      name = "p",
      descriptor = "I"
   )
   public static int field10899;

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(IIILka;I)Loi;"
   )
   public static final class79 method5409(int arg0, int arg1, int arg2, class501 arg3, int arg4) {
      try {
         ++field10894;
         if (arg3 == null) {
            return null;
         } else {
            return arg0 != 86 ? null : new class79(arg1, arg2, arg4, arg3.method368(), arg3.method334(), arg3.method329(), arg3.method366(), arg3.method344(), arg3.method345(), arg3.method357());
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10903[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10903[2] : field10903[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5410(byte arg0) {
      try {
         if (arg0 < -47) {
            field10901 = null;
            field10892 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10903[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method5411(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field10896;
         int var3 = 0;
         if (arg0 > -28) {
            field10899 = -79;
            if (var2) {
               if (class709.field10332[var3].equalsIgnoreCase(arg1)) {
                  return var3;
               }

               ++var3;
            }
         }

         while(true) {
            while(class709.field10332.length > var3) {
               if (class709.field10332[var3].equalsIgnoreCase(arg1)) {
                  return var3;
               }

               ++var3;
            }

            if (!var2) {
               return -1;
            }

            if (-1 != 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10903[7] + arg0 + ',' + (arg1 != null ? field10903[2] : field10903[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(I)Ljga;"
   )
   public final class749 method5412(int arg0) {
      try {
         ++field10890;
         if (arg0 <= 91) {
            this.field10897 = -48;
         }

         return new class749(this.field10898, this.field10900, this.field10897, this.field10888, this.field10889, this.field10887);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10903[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(BLjga;)V"
   )
   public final void method5413(byte arg0, class749 arg1) {
      try {
         this.field10888 = arg1.field10888;
         this.field10887 = arg1.field10887;
         ++field10891;
         this.field10897 = arg1.field10897;
         this.field10889 = arg1.field10889;
         this.field10898 = arg1.field10898;
         if (arg0 != 10) {
            method5409(64, -54, 94, (class501)null, -84);
         }

         this.field10900 = arg1.field10900;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10903[9] + arg0 + ',' + (arg1 != null ? field10903[2] : field10903[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(ILui;)V"
   )
   public static final void method5414(int arg0, class241 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field10895;
         if (arg1 != null) {
            class280.field3738.method3859(2, arg1);
            if (arg0 == 26066) {
               ++class234.field2899;
               Object var3 = null;
               class85 var6;
               if (!arg1.field3009 && !"".equals(arg1.field3011)) {
                  class85 var10000;
                  long var4;
                  label75: {
                     var4 = arg1.field3003;
                     var6 = (class85)class183.field2257.method1839(78, var4);
                     if (var2) {
                        var10000 = var6;
                     } else if (var6 == null) {
                        var10000 = var6;
                        if (!var2) {
                           break label75;
                        }
                     } else {
                        var10000 = var6;
                     }

                     label74:
                     while(true) {
                        while(var10000.field1101.equals(arg1.field3011)) {
                           var10000 = var6;
                           if (!var2) {
                              break label74;
                           }
                        }

                        var6 = (class85)class183.field2257.method1844(false);
                        if (var6 == null) {
                           var10000 = var6;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                        }
                     }
                  }

                  if (var10000 == null) {
                     var6 = (class85)class501.field6886.method4239(var4, arg0 + -26066);
                     if (var6 != null && !var6.field1101.equals(arg1.field3011)) {
                        var6 = null;
                     }

                     if (var6 == null) {
                        var6 = new class85(arg1.field3011);
                     }

                     class183.field2257.method1841(var4, true, var6);
                     ++class432.field6026;
                  }
               } else {
                  var6 = new class85(arg1.field3011);
                  ++class432.field6026;
               }

               if (var6.method833(4197, arg1)) {
                  class338.method2682(var6, (byte)-120);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10903[4] + arg0 + ',' + (arg1 != null ? field10903[2] : field10903[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5415(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         ++field10893;
         class347.field4965.method3637(15);
         class221.field2760.method3751(94);
         class261.field3341.method2419(-111);
         class472.field6533.method3590(-110);
         class742.field10813.method2430((byte)-118);
         class645.field9054.method478(arg0);
         class392.field5479.method1479(1);
         class516.field7085.method1487((byte)-106);
         class402.field5645.method2781(!arg0);
         class517.field7093.method3270(-42);
         class427.field5966.method3294(0);
         class437.field6062.method2889(-4);
         class581.field7984.method3694(false);
         class599.field8358.method2389(64);
         class25.field315.method5237((byte)-114);
         class716.field10503.method2230(1);
         class717.field10511.method5457(126);
         class371.field5238.method1972(29);
         class212.field2634.method3318((byte)-103);
         class757.field10971.method5136((byte)-119);
         class694.field10144.method3220(-67);
         class24.field302.method3900((byte)2);
         class477.field6598.method1527(0);
         class544.method3931(-5176);
         class793.method5716(0);
         class614.method4465(-28047);
         class301.method2265((byte)109);
         if (class304.field4027 != class269.field3480) {
            int var2 = 0;
            if (var1) {
               class110.field1388[var2] = null;
               ++var2;
            }

            while(true) {
               while(var2 < class110.field1388.length) {
                  class110.field1388[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class608.field8538 = 0;
                  break;
               }

               ++var2;
            }
         }

         class606.method4428((byte)-106);
         class522.method3779(arg0);
         class534.method3843(true);
         class11.method89(102);
         class369.method2853((byte)90);
         class16.field225.method4245(arg0);
         class338.field4832.method519();
         class660.method4789((byte)1);
         class299.method2252(-2386);
         class334.field4789.method723(125);
         class41.field480.method723(125);
         class532.field7277.method723(112);
         class21.field261.method723(-102);
         class74.field943.method723(-96);
         class95.field1264.method723(-68);
         class590.field8143.method723(115);
         class66.field763.method723(113);
         class354.field5051.method723(-106);
         class316.field4231.method723(-116);
         class327.field4426.method723(-51);
         class711.field10432.method723(-123);
         class694.field10159.method723(90);
         class194.field2365.method723(-83);
         class154.field1993.method723(-110);
         class237.field2935.method723(-41);
         class156.field2009.method723(90);
         class335.field4809.method723(-74);
         class281.field3754.method723(-75);
         class737.field10752.method723(-40);
         class355.field5060.method723(113);
         class310.field4108.method723(124);
         class12.field144.method723(107);
         class554.field7627.method723(-81);
         class771.field11128.method723(125);
         class698.field10188.method723(107);
         class462.field6334.method723(120);
         class554.field7626.method723(95);
         class150.field1959.method723(-58);
         class92.field1232.method723(112);
         class111.field1405.method723(124);
         class226.field2842.method723(-93);
         class135.field1757.method723(-68);
         class412.field5799.method4245(true);
         class670.field9690.method4245(true);
         class661.field9435.method4245(true);
         class679.field9963.method4245(arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10903[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class749(int arg0) {
      try {
         this.field10898 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10903[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field10897 = arg2;
         this.field10889 = arg4;
         this.field10900 = arg1;
         this.field10888 = arg3;
         this.field10898 = arg0;
         this.field10887 = arg5;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10903[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

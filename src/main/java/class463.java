import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class463 implements class99 {
   @OriginalMember(
      owner = "client!af",
      name = "n",
      descriptor = "Lqh;"
   )
   private class74 field6341;
   @OriginalMember(
      owner = "client!af",
      name = "d",
      descriptor = "Ldba;"
   )
   public class101 field6345;
   @OriginalMember(
      owner = "client!af",
      name = "g",
      descriptor = "Lqh;"
   )
   public class74 field6340;
   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6355 = new String[]{method3404(method3403("k!9E\u0010")), method3404(method3403("qi9W\u0004~fcUE")), method3404(method3403("~z{\u0007")), method3404(method3403("0'")), method3404(method3403("qi9\"E")), method3404(method3403("qi9&E")), method3404(method3403("qi9!E")), method3404(method3403("qi9'E")), method3404(method3403("qi9 E")), method3404(method3403("qi9#E")), method3404(method3403("qi9)E")), method3404(method3403("qi9*E"))};
   @OriginalMember(
      owner = "client!af",
      name = "i",
      descriptor = "I"
   )
   public static int field6353 = 0;
   @OriginalMember(
      owner = "client!af",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6354 = new int[3];
   @OriginalMember(
      owner = "client!af",
      name = "h",
      descriptor = "I"
   )
   public static int field6339;
   @OriginalMember(
      owner = "client!af",
      name = "p",
      descriptor = "I"
   )
   private int field6342;
   @OriginalMember(
      owner = "client!af",
      name = "f",
      descriptor = "I"
   )
   public static int field6343;
   @OriginalMember(
      owner = "client!af",
      name = "l",
      descriptor = "I"
   )
   public static int field6344;
   @OriginalMember(
      owner = "client!af",
      name = "k",
      descriptor = "I"
   )
   public static int field6347;
   @OriginalMember(
      owner = "client!af",
      name = "b",
      descriptor = "I"
   )
   public static int field6349;
   @OriginalMember(
      owner = "client!af",
      name = "c",
      descriptor = "I"
   )
   public static int field6350;
   @OriginalMember(
      owner = "client!af",
      name = "m",
      descriptor = "I"
   )
   public static int field6351;
   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "I"
   )
   public static int field6352;
   @OriginalMember(
      owner = "client!af",
      name = "j",
      descriptor = "J"
   )
   private long field6346;
   @OriginalMember(
      owner = "client!af",
      name = "o",
      descriptor = "Lda;"
   )
   private class66 field6348;

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         ++field6349;
         if (arg0 != 29560) {
            this.method907(true);
         }

         int var3 = this.field6345.field1297.method1433(this.field6345.field1299, class698.field10190, arg0 ^ 29561) + this.field6345.field1301;
         int var4 = this.field6345.field1309.method1325(this.field6345.field1311, class420.field5892, 8599) + this.field6345.field1302;
         this.method1050(var4, arg0 ^ 1657, var3, arg1);
         this.method1047(var4, arg1, (byte)-84, var3);
         String var5 = class444.field6156.method5574(-1312090738);
         if (-this.field6346 + class792.method5708(-25005) > 10000L) {
            var5 = var5 + field6355[3] + class444.field6156.method5581((byte)-45).method3187((byte)116) + ")";
         }

         this.field6348.method617(this.field6345.field1311 / 2 + var4 + 4 + this.field6345.field1303, this.field6345.field1306, var5, -13760, -1, var3 - -(this.field6345.field1299 / 2));
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6355[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(CB)Z"
   )
   public static final boolean method3398(char arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field6344;
         if (Character.isISOControl(arg0)) {
            return false;
         } else if (class365.method2826((byte)-49, arg0)) {
            return true;
         } else {
            char[] var3 = class94.field1247;
            if (arg1 != -100) {
               return true;
            } else {
               int var4 = 0;
               char var5;
               if (var2) {
                  var5 = var3[var4];
                  if (~arg0 == ~var5) {
                     return true;
                  }

                  ++var4;
               }

               while(true) {
                  char var10000;
                  if (~var3.length >= ~var4) {
                     char[] var6 = class566.field7723;
                     var10000 = 0;
                     if (!var2) {
                        int var7 = 0;
                        char var8;
                        if (var2) {
                           var8 = var6[var7];
                           if (~arg0 == ~var8) {
                              return true;
                           }

                           ++var7;
                        }

                        while(true) {
                           if (~var7 <= ~var6.length) {
                              var10000 = 0;
                              if (!var2) {
                                 return false;
                              }
                           } else {
                              var10000 = var6[var7];
                           }

                           var8 = var10000;
                           if (~arg0 == ~var8) {
                              return true;
                           }

                           ++var7;
                        }
                     }
                  } else {
                     var10000 = var3[var4];
                  }

                  var5 = var10000;
                  if (~arg0 == ~var5) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6355[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3399(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != -25631) {
            this.method3399(42);
         }

         ++field6352;
         int var3 = class444.field6156.method5568(arg0 ^ -26143);
         int var4 = var3 * 100;
         if (~this.field6342 != ~var3 || ~var3 == -1) {
            this.field6342 = var3;
            this.field6346 = class792.method5708(arg0 ^ 1458);
            if (!var2) {
               return var4;
            }
         }

         int var5 = class444.field6156.method5575(false);
         if (~var5 < ~var3) {
            long var6 = this.field6346 + -class444.field6156.method5577((byte)-120);
            if (~var6 < -1L) {
               long var8 = var6 * 10000L / (long)var3 * (long)(var5 - var3);
               long var10 = (-this.field6346 + class792.method5708(-25005)) * 10000L;
               if (var10 < var8) {
                  var4 = (int)((long)(-var3 + var5) * 100L * var10 / var8 + (long)(var3 * 100));
                  if (!var2) {
                     return var4;
                  }
               }

               var4 = var5 * 100;
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6355[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(Lwm;ZLjava/lang/String;)I"
   )
   public static final int method3400(class594 arg0, boolean arg1, String arg2) {
      try {
         ++field6350;
         int var3 = arg0.field8243;
         byte[] var4 = class374.method2896(arg2, -32483);
         arg0.method4295((byte)90, var4.length);
         arg0.field8243 += class343.field4907.method3992(95, var4.length, 0, arg0.field8227, arg0.field8243, var4);
         if (!arg1) {
            field6354 = null;
         }

         return arg0.field8243 - var3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6355[7] + (arg0 != null ? field6355[0] : field6355[2]) + ',' + arg1 + ',' + (arg2 != null ? field6355[0] : field6355[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public abstract void method1050(int arg0, int arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(Z)Z"
   )
   public boolean method907(boolean arg0) {
      try {
         ++field6343;
         boolean var2 = arg0;
         if (!this.field6340.method717(this.field6345.field1298, (byte)-58)) {
            var2 = false;
         }

         if (!this.field6341.method717(this.field6345.field1298, (byte)-58)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6355[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(I[B)Ljava/lang/String;"
   )
   public static final String method3401(int arg0, byte[] arg1) {
      try {
         ++field6339;
         if (arg0 >= -87) {
            field6354 = null;
         }

         return class650.method4710(0, arg1.length, -26018, arg1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6355[5] + arg0 + ',' + (arg1 != null ? field6355[0] : field6355[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Ldba;)V"
   )
   public class463(class74 arg0, class74 arg1, class101 arg2) {
      try {
         this.field6341 = arg1;
         this.field6345 = arg2;
         this.field6340 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6355[1] + (arg0 != null ? field6355[0] : field6355[2]) + ',' + (arg1 != null ? field6355[0] : field6355[2]) + ',' + (arg2 != null ? field6355[0] : field6355[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3402(int arg0) {
      try {
         field6354 = null;
         if (arg0 != -21176) {
            method3401(62, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6355[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public abstract void method1047(int arg0, boolean arg1, byte arg2, int arg3);

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(I)V"
   )
   public void method905(int arg0) {
      try {
         ++field6347;
         class663 var2 = class287.method2176(this.field6345.field1298, arg0 ^ 15322, this.field6341);
         if (arg0 != -15238) {
            field6351 = 116;
         }

         this.field6348 = class338.field4832.method496(var2, class267.method2046(this.field6340, this.field6345.field1298), true);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6355[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

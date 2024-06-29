import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class98 extends class264 {
   @OriginalMember(
      owner = "client!eha",
      name = "K",
      descriptor = "I"
   )
   private int field1257 = 4096;
   @OriginalMember(
      owner = "client!eha",
      name = "I",
      descriptor = "I"
   )
   private int field1261 = 3216;
   @OriginalMember(
      owner = "client!eha",
      name = "M",
      descriptor = "I"
   )
   private int field1260 = 3216;
   @OriginalMember(
      owner = "client!eha",
      name = "J",
      descriptor = "[I"
   )
   private int[] field1259 = new int[3];
   @OriginalMember(
      owner = "client!eha",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1264 = new String[]{method832(method831("m?\u001a7( ")), method832(method831("m?\u001a7  ")), method832(method831("f\"\u0017u")), method832(method831("syU7\u0016")), method832(method831("m?\u001a7* ")), method832(method831("m?\u001a7/ ")), method832(method831("m?\u001a7) "))};
   @OriginalMember(
      owner = "client!eha",
      name = "L",
      descriptor = "Leg;"
   )
   public static class118 field1262 = new class118(70, 3);
   @OriginalMember(
      owner = "client!eha",
      name = "H",
      descriptor = "I"
   )
   public static int field1255;
   @OriginalMember(
      owner = "client!eha",
      name = "N",
      descriptor = "I"
   )
   public static int field1256;
   @OriginalMember(
      owner = "client!eha",
      name = "G",
      descriptor = "I"
   )
   public static int field1258;
   @OriginalMember(
      owner = "client!eha",
      name = "F",
      descriptor = "I"
   )
   public static int field1263;

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 3
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (~arg0 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field1257 = arg1.method1211(-26166);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field1261 = arg1.method1211(-26166);
               if (!var4) {
                  break label46;
               }
            }

            this.field1260 = arg1.method1211(-26166);
         }

         ++field1263;
         if (arg2 < 49) {
            this.method3(63, (class147)null, 124);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1264[4] + arg0 + ',' + (arg1 != null ? field1264[3] : field1264[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(II)[I",
      line = 47
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1255;
         int var4 = -102 % ((arg1 - 24) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = class684.field10073 * this.field1257 >> 12;
            int[] var7 = this.method2019(0, -27804, class220.field3144 & arg0 + -1);
            int[] var8 = this.method2019(0, -27804, arg0);
            int[] var9 = this.method2019(0, -27804, class220.field3144 & arg0 - -1);
            int var10 = 0;
            if (var3 || var10 < class430.field6152) {
               do {
                  int var11 = (var9[var10] + -var7[var10]) * var6 >> 12;
                  int var12 = (var8[class78.field967 & var10 - 1] + -var8[class78.field967 & var10 - -1]) * var6 >> 12;
                  int var13 = var12 >> 4;
                  if (~var13 > -1) {
                     var13 = -var13;
                  }

                  int var14 = var11 >> 4;
                  if (~var13 < -256) {
                     var13 = 255;
                  }

                  if (~var14 > -1) {
                     var14 = -var14;
                  }

                  if (~var14 < -256) {
                     var14 = 255;
                  }

                  int var15 = 255 & class338.field4598[((var14 + 1) * var14 >> 1) + var13];
                  int var16 = var11 * var15 >> 8;
                  int var17 = var12 * var15 >> 8;
                  int var18 = var15 * 4096 >> 8;
                  int var19 = this.field1259[0] * var17 >> 12;
                  int var20 = this.field1259[1] * var16 >> 12;
                  int var21 = this.field1259[2] * var18 >> 12;
                  var5[var10] = var20 + var21 + var19;
                  ++var10;
               } while(var10 < class430.field6152);
            }
         }

         return var5;
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field1264[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "()V",
      line = 123
   )
   public class98() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!eha",
      name = "c",
      descriptor = "(Z)V",
      line = 126
   )
   private final void method829(boolean arg0) {
      try {
         ++field1258;
         double var2 = Math.cos((double)((float)this.field1260 / 4096.0F));
         this.field1259[0] = (int)(4096.0D * Math.sin((double)((float)this.field1261 / 4096.0F)) * var2);
         this.field1259[1] = (int)(4096.0D * Math.cos((double)((float)this.field1261 / 4096.0F)) * var2);
         this.field1259[2] = (int)(Math.sin((double)((float)this.field1260 / 4096.0F)) * 4096.0D);
         if (!arg0) {
            this.method413(105);
         }

         int var4 = this.field1259[0] * this.field1259[0] >> 12;
         int var5 = this.field1259[1] * this.field1259[1] >> 12;
         int var6 = this.field1259[2] * this.field1259[2] >> 12;
         int var7 = (int)(4096.0D * Math.sqrt((double)(var4 + var6 - -var5 >> 12)));
         if (~var7 != -1) {
            this.field1259[0] = (this.field1259[0] << 12) / var7;
            this.field1259[2] = (this.field1259[2] << 12) / var7;
            this.field1259[1] = (this.field1259[1] << 12) / var7;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1264[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(I)V",
      line = 178
   )
   public final void method413(int arg0) {
      try {
         ++field1256;
         if (arg0 < 49) {
            field1262 = null;
         }

         this.method829(true);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1264[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "d",
      descriptor = "(I)V",
      line = 189
   )
   public static void method830(int arg0) {
      try {
         if (arg0 != 0) {
            method830(-81);
         }

         field1262 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1264[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method831(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method832(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

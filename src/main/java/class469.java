import jaggl.OpenGL;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class469 extends class393 {
   @OriginalMember(
      owner = "client!hi",
      name = "F",
      descriptor = "Z"
   )
   private boolean field6455 = false;
   @OriginalMember(
      owner = "client!hi",
      name = "v",
      descriptor = "[F"
   )
   private float[] field6457 = new float[4];
   @OriginalMember(
      owner = "client!hi",
      name = "r",
      descriptor = "Z"
   )
   private boolean field6459;
   @OriginalMember(
      owner = "client!hi",
      name = "n",
      descriptor = "Lqia;"
   )
   private class575 field6452;
   @OriginalMember(
      owner = "client!hi",
      name = "y",
      descriptor = "Lqia;"
   )
   private class575 field6463;
   @OriginalMember(
      owner = "client!hi",
      name = "p",
      descriptor = "Lqia;"
   )
   private class575 field6462;
   @OriginalMember(
      owner = "client!hi",
      name = "E",
      descriptor = "Lqia;"
   )
   private class575 field6447;
   @OriginalMember(
      owner = "client!hi",
      name = "j",
      descriptor = "Lcb;"
   )
   private class177 field6450;
   @OriginalMember(
      owner = "client!hi",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6469 = new String[]{method3568(method3567("IM=h@")), method3568(method3567("OQ\u007fA")), method3568(method3567("TSL@\u0007EA\u007fr\u001dOHzY")), method3568(method3567("TSLJ\u001aNQ}I7TJ\u007fD\u001c")), method3568(method3567("FH")), method3568(method3567("IM=\u0011\u0001OMg\u0013@")), method3568(method3567("TSLJ\u001aNQ}I7MMg")), method3568(method3567("TSL@\u0007EA\u007fr\u0004HP")), method3568(method3567("Z\n=\u0003\u0015")), method3568(method3567("IM=j@")), method3568(method3567("IM=d@")), method3568(method3567("IM=f@")), method3568(method3567("IM=g@")), method3568(method3567("IM=c@")), method3568(method3567("IM=l@")), method3568(method3567("LA")), method3568(method3567("CN")), method3568(method3567("IM=}@")), method3568(method3567("IM=a@")), method3568(method3567("IM=n@"))};
   @OriginalMember(
      owner = "client!hi",
      name = "w",
      descriptor = "I"
   )
   public static int field6464 = -1;
   @OriginalMember(
      owner = "client!hi",
      name = "m",
      descriptor = "Lifa;"
   )
   public static class75 field6461 = new class75(1, 4);
   @OriginalMember(
      owner = "client!hi",
      name = "o",
      descriptor = "I"
   )
   public static int field6446;
   @OriginalMember(
      owner = "client!hi",
      name = "t",
      descriptor = "I"
   )
   public static int field6448;
   @OriginalMember(
      owner = "client!hi",
      name = "B",
      descriptor = "I"
   )
   public static int field6451;
   @OriginalMember(
      owner = "client!hi",
      name = "D",
      descriptor = "I"
   )
   public static int field6453;
   @OriginalMember(
      owner = "client!hi",
      name = "l",
      descriptor = "I"
   )
   public static int field6454;
   @OriginalMember(
      owner = "client!hi",
      name = "x",
      descriptor = "I"
   )
   public static int field6458;
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "I"
   )
   public static int field6460;
   @OriginalMember(
      owner = "client!hi",
      name = "k",
      descriptor = "I"
   )
   public static int field6465;
   @OriginalMember(
      owner = "client!hi",
      name = "A",
      descriptor = "I"
   )
   public static int field6466;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hi",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field6467;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hi",
      name = "q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field6468;
   @OriginalMember(
      owner = "client!hi",
      name = "C",
      descriptor = "Z"
   )
   private boolean field6449;
   @OriginalMember(
      owner = "client!hi",
      name = "u",
      descriptor = "Z"
   )
   private boolean field6456;

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         label34: {
            if (arg0 != null) {
               if (this.field6455) {
                  super.field5438.method2288((byte)-10, class363.field5039, 0);
                  super.field5438.method2211((byte)-124, class363.field5039, 0);
                  this.field6455 = false;
               }

               super.field5438.method2265(arg0, (byte)-35);
               super.field5438.method2240(-4, arg2);
               if (!client.field1481) {
                  break label34;
               }
            }

            if (!this.field6455) {
               super.field5438.method2265(super.field5438.field3878, (byte)74);
               super.field5438.method2240(-4, 1);
               super.field5438.method2288((byte)-10, class48.field640, 0);
               super.field5438.method2211((byte)-127, class48.field640, 0);
               this.field6455 = true;
            }
         }

         ++field6451;
         if (arg1 < 84) {
            method3565((byte)-122);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6469[12] + (arg0 != null ? field6469[8] : field6469[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         ++field6453;
         if (arg1 != 7313) {
            this.field6463 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6469[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Llea;Lww;)V"
   )
   public class469(class574 arg0, class339 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field8520) {
            this.field6452 = class92.method851(arg1.method2692(field6469[4], field6469[3], (byte)-86), (byte)70, arg0, 34336);
            this.field6463 = class92.method851(arg1.method2692(field6469[4], field6469[6], (byte)-86), (byte)70, arg0, 34336);
            this.field6462 = class92.method851(arg1.method2692(field6469[4], field6469[2], (byte)-86), (byte)70, arg0, 34336);
            this.field6447 = class92.method851(arg1.method2692(field6469[4], field6469[7], (byte)-86), (byte)70, arg0, 34336);
            if (this.field6462 != null & this.field6452 != null & this.field6463 != null & this.field6447 != null) {
               this.field6450 = super.field5438.method2283((byte)-53, 2, false, 1, new int[]{0, -1});
               this.field6450.method1516(false, false, 13852);
               this.field6459 = true;
            } else {
               this.field6459 = false;
            }
         } else {
            this.field6459 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6469[5] + (arg0 != null ? field6469[8] : field6469[1]) + ',' + (arg1 != null ? field6469[8] : field6469[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3563() {
      if (class520.field7312 != null) {
         for(int var0 = 0; var0 < class520.field7312.length; ++var0) {
            for(int var1 = 0; var1 < class137.field1743; ++var1) {
               for(int var2 = 0; var2 < class181.field2297; ++var2) {
                  if (class520.field7312[var0][var1][var2] != null) {
                     class520.field7312[var0][var1][var2].method5281(4);
                  }

                  class520.field7312[var0][var1][var2] = null;
               }
            }
         }
      }

      class520.field7312 = null;
      class373.field5223 = null;
      if (class392.field5432 != null) {
         for(int var3 = 0; var3 < class392.field5432.length; ++var3) {
            for(int var4 = 0; var4 < class137.field1743; ++var4) {
               for(int var5 = 0; var5 < class181.field2297; ++var5) {
                  if (class392.field5432[var3][var4][var5] != null) {
                     class392.field5432[var3][var4][var5].method5281(4);
                  }

                  class392.field5432[var3][var4][var5] = null;
               }
            }
         }
      }

      class392.field5432 = null;
      class569.field8364 = null;
      class548.field8080 = null;
      class659.field9815 = null;
      class276.field3516 = null;
      class134.field1685 = null;
      class579.field8574 = null;
      class372.field5217 = null;
      class587.field8659 = null;
      class534.method4059(0);
      if (class156.field2017 != null) {
         for(int var6 = 0; var6 < class315.field4362; ++var6) {
            class156.field2017[var6] = null;
         }

         class315.field4362 = 0;
      }

      class127.field1637 = null;
      class217.field2753 = null;
      class500.field6970 = null;
      if (class120.field1597 != null) {
         for(int var7 = 0; var7 < class120.field1597.length; ++var7) {
            class120.field1597[var7] = null;
         }

         class465.field6400 = 0;
      }

      if (class335.field4600 != null) {
         for(int var8 = 0; var8 < class335.field4600.length; ++var8) {
            class335.field4600[var8] = null;
         }

         class289.field3990 = 0;
      }

      if (class375.field5241 != null) {
         for(int var9 = 0; var9 < class77.field1023; ++var9) {
            class375.field5241[var9] = null;
         }

         for(int var10 = 0; var10 < class174.field2251; ++var10) {
            for(int var11 = 0; var11 < class137.field1743; ++var11) {
               for(int var12 = 0; var12 < class181.field2297; ++var12) {
                  class314.field4356[var10][var11][var12] = 0L;
               }
            }
         }

         class77.field1023 = 0;
      }

      class371.method2935(-3545);
      class422.field5749 = class422.field5751;
      class422.field5749.method297(0);
      class684.field10073 = null;
      class743.field10860 = null;
      class47.field600 = null;
      if (class403.field5537 != null) {
         class570.method4276();
         class158.field2032.method514(1);
         class158.field2032.method394(0);
      }

      if (class700.field10259 != null) {
         class700.field10259 = null;
      }

      class158.field2032 = null;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3101(byte arg0) {
      try {
         int var2;
         class620 var3;
         label35: {
            ++field6460;
            var2 = super.field5438.method2221(-87);
            var3 = super.field5438.method2241((byte)-104);
            if (!this.field6449) {
               OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field6452.field8527 : this.field6462.field8527);
               if (!client.field1481) {
                  break label35;
               }
            }

            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6447.field8527 : this.field6463.field8527);
         }

         OpenGL.glEnable(34336);
         this.field6456 = true;
         var3.method4592((float)var2, 0.0F, (byte)22, -1.0F, this.field6457, 0.0F);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6457[0], this.field6457[1], this.field6457[2], this.field6457[3]);
         this.method2738(arg0 ^ -86);
         if (arg0 != -86) {
            field6464 = -127;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6469[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method3564(byte arg0) {
      try {
         field6461 = null;
         if (arg0 > -111) {
            method3564((byte)-27);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6469[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2738(int arg0) {
      try {
         if (this.field6456) {
            int var2 = super.field5438.method499();
            int var3 = super.field5438.method519();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 + -((float)(-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field5438.method2246(arg0 + 8), (float)super.field5438.method2245(0) / 255.0F);
            super.field5438.method2238(9, 1);
            super.field5438.method2276(super.field5438.method2292(0), arg0 ^ 121);
            super.field5438.method2238(9, 0);
         }

         if (arg0 != 0) {
            method3565((byte)-82);
         }

         ++field6466;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6469[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         ++field6448;
         this.field6449 = arg0;
         super.field5438.method2238(9, 1);
         super.field5438.method2265(this.field6450, (byte)-106);
         super.field5438.method2231(class749.field10941, class318.field4380, (byte)61);
         super.field5438.method2288((byte)-10, class354.field4947, 0);
         super.field5438.method1409(false, true, class363.field5039, 2, arg1 ^ -126);
         super.field5438.method2211((byte)79, class48.field640, 0);
         super.field5438.method2238(9, 0);
         this.method3101((byte)-86);
         if (arg1 != 32) {
            this.method1457((byte)-9);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6469[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "g",
      descriptor = "(B)I"
   )
   public static final int method3565(byte arg0) {
      boolean var1 = client.field1481;

      try {
         if (arg0 != -78) {
            field6464 = -11;
         }

         ++field6458;
         int var2 = 0;
         Field[] var3 = (field6467 != null ? field6467 : (field6467 = method3566(field6469[15]))).getDeclaredFields();
         Field[] var4 = var3;
         int var5 = 0;
         if (!var1 && ~var5 <= ~var3.length) {
            return var2 + 1;
         } else {
            do {
               Field var6 = var4[var5];
               if ((field6468 != null ? field6468 : (field6468 = method3566(field6469[16]))).isAssignableFrom(var6.getType())) {
                  ++var2;
               }

               ++var5;
            } while(~var5 > ~var4.length);

            return var2 + 1;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6469[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         ++field6465;
         super.field5438.method2238(9, 1);
         super.field5438.method2265((class421)null, (byte)115);
         super.field5438.method2231(class231.field2873, class231.field2873, (byte)-77);
         super.field5438.method2288((byte)-10, class363.field5039, 0);
         super.field5438.method2288((byte)-10, class354.field4947, 2);
         super.field5438.method2211((byte)-126, class363.field5039, 0);
         int var2 = -89 % ((arg0 - 22) / 63);
         super.field5438.method2238(9, 0);
         if (this.field6455) {
            super.field5438.method2288((byte)-10, class363.field5039, 0);
            super.field5438.method2211((byte)-125, class363.field5039, 0);
            this.field6455 = false;
         }

         if (this.field6456) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6456 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6469[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 == 29404) {
            ++field6446;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6469[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         if (arg0) {
            this.field6449 = false;
         }

         ++field6454;
         return this.field6459;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6469[19] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3566(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3568(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

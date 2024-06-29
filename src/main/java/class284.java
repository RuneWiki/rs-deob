import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class284 extends class393 {
   @OriginalMember(
      owner = "client!eba",
      name = "j",
      descriptor = "F"
   )
   private float field3936 = 0.0F;
   @OriginalMember(
      owner = "client!eba",
      name = "m",
      descriptor = "Ldd;"
   )
   private class712 field3940;
   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3944 = new String[]{method2319(method2318("H\u001e\u0012)t\u0005")), method2319(method2318("H\u001e\u0012){\u0005")), method2319(method2318("H\u001e\u0012)y\u0005")), method2319(method2318("H\u001e\u0012)\u007f\u0005")), method2319(method2318("H\u001e\u0012)u\u0005")), method2319(method2318("C\t\u001fk")), method2319(method2318("VR])A")), method2319(method2318("H\u001e\u0012)\u0000D\u0012\u001as\u0002\u0005")), method2319(method2318("H\u001e\u0012)w\u0005")), method2319(method2318("H\u001e\u0012)v\u0005")), method2319(method2318("H\u001e\u0012)x\u0005"))};
   @OriginalMember(
      owner = "client!eba",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field3942 = new int[8];
   @OriginalMember(
      owner = "client!eba",
      name = "s",
      descriptor = "Laka;"
   )
   public static class418 field3937 = new class418(69, 4);
   @OriginalMember(
      owner = "client!eba",
      name = "q",
      descriptor = "I"
   )
   public static int field3933;
   @OriginalMember(
      owner = "client!eba",
      name = "l",
      descriptor = "I"
   )
   public static int field3934;
   @OriginalMember(
      owner = "client!eba",
      name = "r",
      descriptor = "I"
   )
   public static int field3935;
   @OriginalMember(
      owner = "client!eba",
      name = "n",
      descriptor = "I"
   )
   public static int field3938;
   @OriginalMember(
      owner = "client!eba",
      name = "t",
      descriptor = "I"
   )
   public static int field3939;
   @OriginalMember(
      owner = "client!eba",
      name = "o",
      descriptor = "I"
   )
   public static int field3941;
   @OriginalMember(
      owner = "client!eba",
      name = "k",
      descriptor = "I"
   )
   public static int field3943;

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field3938;
         if (arg1 != 7313) {
            this.method1462(-25, 48, 63);
         }

         label40: {
            super.field5438.method2238(arg1 + -7304, 1);
            if (~(128 & arg0) == -1) {
               if (~(1 & arg2) == -2) {
                  if (!this.field3940.field10445) {
                     int var5 = super.field5438.field3805 % 4000 * 16 / 4000;
                     super.field5438.method2265(this.field3940.field10455[var5], (byte)85);
                     if (!var4) {
                        break label40;
                     }
                  }

                  this.field3936 = (float)(super.field5438.field3805 % 4000) / 4000.0F;
                  super.field5438.method2265(this.field3940.field10444, (byte)82);
                  if (!var4) {
                     break label40;
                  }
               }

               if (this.field3940.field10445) {
                  super.field5438.method2265(this.field3940.field10444, (byte)118);
                  if (!var4) {
                     break label40;
                  }
               }

               super.field5438.method2265(this.field3940.field10455[0], (byte)73);
               if (!var4) {
                  break label40;
               }
            }

            super.field5438.method2265((class421)null, (byte)-77);
         }

         super.field5438.method2238(arg1 + -7304, 0);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3944[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         ++field3933;
         return arg0 ? false : this.field3940.method5201((byte)-87);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3944[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         super.field5438.method2238(9, 1);
         ++field3939;
         super.field5438.method2231(class231.field2873, class231.field2873, (byte)41);
         super.field5438.method2288((byte)-10, class363.field5039, 0);
         super.field5438.method2211((byte)109, class363.field5039, 0);
         int var2 = -72 % ((arg0 - 22) / 63);
         super.field5438.method1414(-117, 1);
         super.field5438.method2265((class421)null, (byte)123);
         super.field5438.method2238(9, 0);
         super.field5438.method2211((byte)-127, class363.field5039, 0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3944[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         ++field3941;
         if (arg1 < 84) {
            this.method1462(-15, 102, 90);
         }

         super.field5438.method2265(arg0, (byte)-33);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3944[9] + (arg0 != null ? field3944[6] : field3944[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         super.field5438.method2238(9, 1);
         ++field3934;
         super.field5438.method2231(class242.field3052, class318.field4380, (byte)-83);
         super.field5438.method1409(false, true, class363.field5039, 0, -123);
         super.field5438.method2211((byte)13, class48.field640, 0);
         super.field5438.method1414(arg1 ^ 25, 0);
         super.field5438.method2238(9, 0);
         super.field5438.method2276(-16777216, arg1 + 80);
         super.field5438.method2211((byte)-122, class354.field4947, 0);
         this.method2317((byte)-109);
         if (arg1 != 32) {
            this.method1459(false, (byte)-59);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3944[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "<init>",
      descriptor = "(Lfm;Ldd;)V"
   )
   public class284(class281 arg0, class712 arg1) {
      super(arg0);

      try {
         this.field3940 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3944[7] + (arg0 != null ? field3944[6] : field3944[5]) + ',' + (arg1 != null ? field3944[6] : field3944[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method2316(byte arg0) {
      try {
         field3942 = null;
         field3937 = null;
         if (arg0 != 63) {
            method2316((byte)83);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3944[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2317(byte arg0) {
      try {
         if (arg0 != -109) {
            this.method1460(true);
         }

         if (super.field5438.method2294(-15521) == 0) {
            class620 var2 = super.field5438.method2226(2702);
            super.field5438.method2238(arg0 + 118, 1);
            class620 var3 = super.field5438.method2264((byte)100);
            var3.method874(var2);
            var3.method4572(false, 0.125F, 1.0F, 0.125F);
            var3.method4573(0.0F, 2, this.field3936, 0.0F);
            super.field5438.method2223(false, class644.field9663);
            super.field5438.method2238(arg0 ^ -102, 0);
         }

         ++field3943;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3944[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 == 29404) {
            ++field3935;
            super.field5438.method2231(class231.field2873, class318.field4380, (byte)-115);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3944[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

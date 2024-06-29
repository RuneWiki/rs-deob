import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class393 extends class242 {
   @OriginalMember(
      owner = "client!ku",
      name = "u",
      descriptor = "F"
   )
   private float field5797 = 0.0F;
   @OriginalMember(
      owner = "client!ku",
      name = "q",
      descriptor = "Lqu;"
   )
   private class105 field5793;
   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5799 = new String[]{method3048(method3047("!K\u0015\u0007*")), method3048(method3047("!K\u0015\r*")), method3048(method3047("1\u0010\u0015a\u007f")), method3048(method3047("!K\u0015sk$WOq*")), method3048(method3047("$KW#")), method3048(method3047("!K\u0015\u0001*")), method3048(method3047("!K\u0015\b*")), method3048(method3047("!K\u0015\u0002*")), method3048(method3047("!K\u0015\u000b*")), method3048(method3047("!K\u0015\u0006*")), method3048(method3047("!K\u0015\u0004*")), method3048(method3047("!K\u0015\u000e*"))};
   @OriginalMember(
      owner = "client!ku",
      name = "p",
      descriptor = "I"
   )
   public static int field5788;
   @OriginalMember(
      owner = "client!ku",
      name = "r",
      descriptor = "I"
   )
   public static int field5789;
   @OriginalMember(
      owner = "client!ku",
      name = "w",
      descriptor = "I"
   )
   public static int field5790;
   @OriginalMember(
      owner = "client!ku",
      name = "v",
      descriptor = "I"
   )
   public static int field5791;
   @OriginalMember(
      owner = "client!ku",
      name = "n",
      descriptor = "I"
   )
   public static int field5792;
   @OriginalMember(
      owner = "client!ku",
      name = "o",
      descriptor = "I"
   )
   public static int field5794;
   @OriginalMember(
      owner = "client!ku",
      name = "y",
      descriptor = "I"
   )
   public static int field5795;
   @OriginalMember(
      owner = "client!ku",
      name = "t",
      descriptor = "I"
   )
   public static int field5796;
   @OriginalMember(
      owner = "client!ku",
      name = "x",
      descriptor = "I"
   )
   public static int field5798;
   @OriginalMember(
      owner = "client!ku",
      name = "s",
      descriptor = "Lha;"
   )
   public static class65 field5787;

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 3
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         ++field5789;
         super.field3498.method2806(false, arg2);
         if (arg1 <= 12) {
            field5787 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5799[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5799[2] : field5799[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "c",
      descriptor = "(I)V",
      line = 15
   )
   public final void method1598(int arg0) {
      try {
         if (super.field3498.method2729(-59) == 0) {
            class104 var2 = super.field3498.method2794(false);
            super.field3498.method2767((byte)-112, 1);
            class104 var3 = super.field3498.method2776((byte)97);
            var3.method982(var2);
            var3.method985(0.125F, 1.0F, -126, 0.125F);
            var3.method1003(0.0F, (byte)-92, 0.0F, this.field5797);
            super.field3498.method2765(class608.field8730, 140);
            super.field3498.method2767((byte)-112, 0);
         }

         if (arg0 < 54) {
            method3046((String)null, -41);
         }

         ++field5791;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5799[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "<init>",
      descriptor = "(Lcs;Lqu;)V",
      line = 41
   )
   public class393(class357 arg0, class105 arg1) {
      super(arg0);

      try {
         this.field5793 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5799[3] + (arg0 != null ? field5799[2] : field5799[4]) + ',' + (arg1 != null ? field5799[2] : field5799[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(ZZ)V",
      line = 49
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         super.field3498.method2761(class621.field9036, (byte)-69, class641.field9348);
         if (arg0) {
            ++field5788;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5799[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "f",
      descriptor = "(I)V",
      line = 60
   )
   public final void method68(int arg0) {
      try {
         ++field5798;
         super.field3498.method2767((byte)-112, 1);
         super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
         super.field3498.method2779(8, 0, class540.field7850);
         super.field3498.method2783(3592, class540.field7850, 0);
         super.field3498.method1176(1, (byte)92);
         super.field3498.method2806(false, (class47)null);
         super.field3498.method2767((byte)-112, 0);
         super.field3498.method2783(3592, class540.field7850, 0);
         int var2 = -38 % ((arg0 - 27) / 34);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5799[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "d",
      descriptor = "(B)V",
      line = 81
   )
   public static void method3045(byte arg0) {
      try {
         field5787 = null;
         int var1 = -128 % ((-67 - arg0) / 50);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5799[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I",
      line = 90
   )
   public static final int method3046(String arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field5794;
         if (arg1 < 105) {
            return -24;
         } else {
            int var3 = arg0.length();
            int var4 = 0;
            int var5 = 0;
            if (var2) {
               var4 = (var4 << 5) - var4 - -arg0.charAt(var5);
               ++var5;
            }

            while(true) {
               while(var3 > var5) {
                  var4 = (var4 << 5) - var4 - -arg0.charAt(var5);
                  ++var5;
               }

               if (!var2) {
                  return var4;
               }

               var4 = var4;
               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5799[5] + (arg0 != null ? field5799[2] : field5799[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "e",
      descriptor = "(I)Z",
      line = 115
   )
   public final boolean method69(int arg0) {
      try {
         ++field5795;
         if (arg0 != 30453) {
            this.method68(74);
         }

         return this.field5793.method1022(4);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5799[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(IIB)V",
      line = 129
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg2 > -64) {
            field5787 = null;
         }

         label40: {
            super.field3498.method2767((byte)-112, 1);
            ++field5792;
            if (~(128 & arg0) == -1) {
               if (~(arg1 & 1) == -2) {
                  if (!this.field5793.field1744) {
                     int var5 = super.field3498.field5227 % 4000 * 16 / 4000;
                     super.field3498.method2806(false, this.field5793.field1746[var5]);
                     if (!var4) {
                        break label40;
                     }
                  }

                  this.field5797 = (float)(super.field3498.field5227 % 4000) / 4000.0F;
                  super.field3498.method2806(false, this.field5793.field1749);
                  if (!var4) {
                     break label40;
                  }
               }

               if (this.field5793.field1744) {
                  super.field3498.method2806(false, this.field5793.field1749);
                  if (!var4) {
                     break label40;
                  }
               }

               super.field3498.method2806(false, this.field5793.field1746[0]);
               if (!var4) {
                  break label40;
               }
            }

            super.field3498.method2806(false, (class47)null);
         }

         super.field3498.method2767((byte)-112, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5799[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(ZI)V",
      line = 173
   )
   public final void method72(boolean arg0, int arg1) {
      try {
         super.field3498.method2767((byte)-112, 1);
         ++field5796;
         super.field3498.method2761(class345.field4912, (byte)-69, class641.field9348);
         super.field3498.method1177(false, 0, true, class540.field7850, -99);
         super.field3498.method2783(3592, class315.field4537, 0);
         super.field3498.method1176(0, (byte)-90);
         super.field3498.method2767((byte)-112, 0);
         super.field3498.method2754(-16777216, (byte)-117);
         super.field3498.method2783(3592, class295.field4119, 0);
         if (arg1 != -29461) {
            this.method1598(93);
         }

         this.method1598(58);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5799[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3047(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3048(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

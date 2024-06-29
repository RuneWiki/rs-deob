import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class67 extends class555 {
   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field778 = new String[]{method643(method642("\u0005b\u0002j\r")), method643(method642("\u0005b\u0002n\r")), method643(method642("\u0005b\u0002o\r")), method643(method642("\u0005b\u0002m\r")), method643(method642("\u0005b\u0002h\r")), method643(method642("\u0016`")), method643(method642("\u0012u")), method643(method642("3iXJIGR^JK\u0014&cEV\u0004tINK]&")), method643(method642("GQMGI\u0014<\f")), method643(method642("GGO_L\u0011c\u0016\u000b")), method643(method642("#\u007fBJH\u000ee\u0016\u000b")), method643(method642("(eOGP\u0003c\fhD\u000be\f\u007fJ\bm\u0016\u000b")), method643(method642("(eOGP\u0003c^X\u001fG")), method643(method642("3iXJIGI\\JT\u0012c\fdK\u0014e^N@\t<\f")), method643(method642("GE|X\u001fG")), method643(method642("(eOGP\u0003cH\u0011\u0005 tC^K\u0003<")), method643(method642("GVES@\u000bu\u0016\u000b")), method643(method642("\ts@G")), method643(method642("\u0005b\u0002l\r")), method643(method642("\u001c(\u0002\u0005X")), method643(method642("\u0005b\u0002i\r"))};
   @OriginalMember(
      owner = "client!bd",
      name = "p",
      descriptor = "I"
   )
   public static int field771 = 0;
   @OriginalMember(
      owner = "client!bd",
      name = "k",
      descriptor = "I"
   )
   public static int field773 = 0;
   @OriginalMember(
      owner = "client!bd",
      name = "j",
      descriptor = "I"
   )
   public static int field766;
   @OriginalMember(
      owner = "client!bd",
      name = "h",
      descriptor = "I"
   )
   public static int field767;
   @OriginalMember(
      owner = "client!bd",
      name = "i",
      descriptor = "I"
   )
   public static int field768;
   @OriginalMember(
      owner = "client!bd",
      name = "n",
      descriptor = "I"
   )
   public static int field769;
   @OriginalMember(
      owner = "client!bd",
      name = "m",
      descriptor = "I"
   )
   public static int field770;
   @OriginalMember(
      owner = "client!bd",
      name = "g",
      descriptor = "I"
   )
   public static int field772;
   @OriginalMember(
      owner = "client!bd",
      name = "l",
      descriptor = "I"
   )
   public static int field774;
   @OriginalMember(
      owner = "client!bd",
      name = "f",
      descriptor = "I"
   )
   public static int field775;
   @OriginalMember(
      owner = "client!bd",
      name = "q",
      descriptor = "I"
   )
   public static int field776;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bd",
      name = "o",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field777;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field768;
         if (arg1 <= 36) {
            this.method635(26);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field778[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class67(int arg0, class605 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method634(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field774;
         boolean var4 = true;
         class712 var5 = (class712)class396.method3009(arg3, arg0, arg1);
         if (var5 != null) {
            var4 &= class4.method25(-5958, var5);
         }

         if (arg2 != 8601) {
            method634(-45, -122, 109, -87);
         }

         class712 var6 = (class712)class737.method5341(arg3, arg0, arg1, field777 != null ? field777 : (field777 = method641(field778[5])));
         if (var6 != null) {
            var4 &= class4.method25(arg2 + -14559, var6);
         }

         class712 var7 = (class712)class270.method2064(arg3, arg0, arg1);
         if (var7 != null) {
            var4 &= class4.method25(-5958, var7);
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field778[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            method636();
         }

         ++field769;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field778[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "()V"
   )
   public static final void method636() {
      byte var0 = 10;
      byte var1 = 30;
      if (field773 != 0 && class520.field7122 != null) {
         class292.field3851.method582(class473.field6565);

         for(int var2 = 0; var2 < class245.field3064.length; ++var2) {
            class292.field3851.method587(class473.field6565[1], -256, class530.field7271[var2] + class245.field3064[var2], class473.field6565[3] - class473.field6565[1], (byte)-62);
         }

         for(int var3 = 0; var3 < class523.field7165; ++var3) {
            class777 var11 = class614.field8580[var3];
            class292.field3851.method568(var11.field11298[0], var11.field11312[0], var11.field11305[0], class192.field2344);
            class292.field3851.method568(var11.field11298[1], var11.field11312[1], var11.field11305[1], class327.field4453);
            class292.field3851.method568(var11.field11298[2], var11.field11312[2], var11.field11305[2], class463.field6354);
            class292.field3851.method568(var11.field11298[3], var11.field11312[3], var11.field11305[3], class47.field545);
            if (class192.field2344[2] != -1 && class327.field4453[2] != -1 && class463.field6354[2] != -1 && class47.field545[2] != -1) {
               int var12 = -65536;
               if (var11.field11296 == 4) {
                  var12 = -16776961;
               }

               class292.field3851.method536(var12, 1, class192.field2344[1], class192.field2344[0], class327.field4453[0], class327.field4453[1]);
               class292.field3851.method536(var12, 1, class327.field4453[1], class327.field4453[0], class463.field6354[0], class463.field6354[1]);
               class292.field3851.method536(var12, 1, class463.field6354[1], class463.field6354[0], class47.field545[0], class47.field545[1]);
               class292.field3851.method536(var12, 1, class47.field545[1], class47.field545[0], class192.field2344[0], class192.field2344[1]);
               class292.field3851.method536(var12, 1, class192.field2344[1], class192.field2344[0], class463.field6354[0], class463.field6354[1]);
            }
         }

         class520.field7122.method630(-256, var1 + 45, field778[10] + class450.field6222 + "/" + 5000, -16777216, var0, 16656);
         class520.field7122.method630(-256, var1 + 60, field778[13] + class766.field11052 + "/" + 10000, -16777216, var0, 16656);
         class520.field7122.method630(-256, var1 + 75, field778[7] + class552.field7595 + "/" + 5000, -16777216, var0, 16656);
         class520.field7122.method630(-256, var1 + 90, field778[12] + (class642.field9026 + class623.field8695) + field778[9] + class523.field7165, -16777216, var0, 16656);
         class520.field7122.method630(-256, var1 + 105, field778[15] + class666.field9475 + field778[8] + class163.field2096 + field778[14] + class517.field7091 + field778[16] + class111.field1406, -16777216, var0, 16656);
         class520.field7122.method630(-256, var1 + 120, field778[11] + class241.field2999 / 1000L + field778[6], -16777216, var0, 16656);
         if (field773 == 2 && class793.field11583 != null) {
            for(int var4 = 0; var4 < class793.field11583.length; ++var4) {
               float var6 = (float)class793.field11583[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class793.field11583[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class763 var5 = class292.field3851.method525(class243.field3041, class793.field11583, class696.field10168, class243.field3041, 0, 0);
            var5.method1631(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field766;
         if (super.field7632 != 1 && super.field7632 != 0) {
            super.field7632 = this.method635(125);
         }

         if (arg0 != -13712) {
            method634(42, -97, 45, 15);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field778[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field770;
         super.field7632 = arg0;
         int var3 = -81 % ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field778[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class67(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Lwm;Z)Lvd;"
   )
   public static final class41 method639(class594 arg0, boolean arg1) {
      try {
         if (arg1) {
            field767 = -3;
         }

         ++field772;
         int var2 = arg0.method4302(!arg1);
         return new class41(var2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field778[18] + (arg0 != null ? field778[19] : field778[17]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method640(byte arg0) {
      try {
         if (arg0 >= -61) {
            field767 = 6;
         }

         ++field775;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field778[20] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method641(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

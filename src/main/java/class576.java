import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class576 extends class550 {
   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8527 = new String[]{method4323(method4322("\u001c]IQ,")), method4323(method4322("\u001c]IW,")), method4323(method4322("\u0005B\u000b~")), method4323(method4322("\u001c]I\\,")), method4323(method4322("\u0010\u0019I<y")), method4323(method4322("\u001c]I^,")), method4323(method4322("\u001c]I],")), method4323(method4322("\u001c]IT,")), method4323(method4322("\u001c]I[,")), method4323(method4322("\u001c]IP,")), method4323(method4322("\u001c]IS,"))};
   @OriginalMember(
      owner = "client!wj",
      name = "t",
      descriptor = "I"
   )
   public static int field8516 = 0;
   @OriginalMember(
      owner = "client!wj",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field8523 = new class498(80, -2);
   @OriginalMember(
      owner = "client!wj",
      name = "p",
      descriptor = "I"
   )
   public static int field8517;
   @OriginalMember(
      owner = "client!wj",
      name = "q",
      descriptor = "I"
   )
   public static int field8518;
   @OriginalMember(
      owner = "client!wj",
      name = "k",
      descriptor = "I"
   )
   public static int field8519;
   @OriginalMember(
      owner = "client!wj",
      name = "j",
      descriptor = "I"
   )
   public static int field8520;
   @OriginalMember(
      owner = "client!wj",
      name = "r",
      descriptor = "I"
   )
   public static int field8521;
   @OriginalMember(
      owner = "client!wj",
      name = "l",
      descriptor = "I"
   )
   public static int field8522;
   @OriginalMember(
      owner = "client!wj",
      name = "n",
      descriptor = "I"
   )
   public static int field8524;
   @OriginalMember(
      owner = "client!wj",
      name = "s",
      descriptor = "I"
   )
   public static int field8525;
   @OriginalMember(
      owner = "client!wj",
      name = "o",
      descriptor = "I"
   )
   public static int field8526;

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(ZB)V",
      line = 5
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         if (arg1 < -44) {
            super.field8234.method2217(15, true);
            ++field8520;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8527[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lfq;I)Lfq;",
      line = 18
   )
   public static final class374 method4319(class374 arg0, int arg1) {
      try {
         ++field8518;
         class374 var2 = client.method1152(arg0);
         if (var2 == null) {
            var2 = arg0.field5882;
         }

         if (arg1 != 0) {
            method4319((class374)null, -87);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8527[3] + (arg0 != null ? field8527[4] : field8527[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(BII)V",
      line = 34
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != 90) {
            this.method73(false, (byte)-87);
         }

         ++field8517;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8527[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lfq;Lfq;I)V",
      line = 46
   )
   public static final void method4320(class374 arg0, class374 arg1, int arg2) {
      try {
         ++field8524;
         ++class325.field4947;
         if (arg2 != 80) {
            method4319((class374)null, -105);
         }

         class577 var3 = class218.method1888(class423.field6526, 111, class510.field7801.field361);
         var3.field8531.method2853(false, arg1.field5848);
         var3.field8531.method2874((byte)-23, arg1.field5927);
         var3.field8531.method2856(65, arg0.field5927);
         var3.field8531.method2901(8, arg1.field5840);
         var3.field8531.method2838(arg0.field5840, -103);
         var3.field8531.method2853(false, arg0.field5848);
         class510.field7801.method211(var3, 127);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8527[5] + (arg0 != null ? field8527[4] : field8527[2]) + ',' + (arg1 != null ? field8527[4] : field8527[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(Lmu;)V",
      line = 67
   )
   public class576(class258 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(BZ)V",
      line = 70
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         if (arg0 >= 82) {
            ++field8521;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8527[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "g",
      descriptor = "(I)V",
      line = 80
   )
   public static void method4321(int arg0) {
      try {
         field8523 = null;
         if (arg0 != -31106) {
            field8526 = 68;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8527[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "(B)Z",
      line = 98
   )
   public final boolean method69(byte arg0) {
      try {
         if (arg0 != 120) {
            return true;
         } else {
            ++field8525;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8527[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(I)V",
      line = 111
   )
   public final void method72(int arg0) {
      try {
         super.field8234.method2217(15, false);
         ++field8519;
         if (arg0 != -2) {
            method4321(-88);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8527[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 126
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         super.field8234.method2193(arg2, (byte)-19);
         ++field8522;
         int var4 = -67 % ((arg1 - 18) / 60);
         super.field8234.method2255(arg0, (byte)90);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8527[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8527[4] : field8527[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4322(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4323(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

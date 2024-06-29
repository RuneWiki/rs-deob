import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class490 {
   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "I"
   )
   public int field7015;
   @OriginalMember(
      owner = "client!qg",
      name = "g",
      descriptor = "I"
   )
   public int field7012;
   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "I"
   )
   public int field7017;
   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7022 = new String[]{method3565(method3564("H_\u0006\u001bn")), method3565(method3564("v[K63]]L`f~JG/(]\u0002")), method3565(method3564("\u0019yK./O]\u0012z")), method3565(method3564("v[K63]]Z)|\u0019")), method3565(method3564("\u0019hA\"#UK\u0012z")), method3565(method3564("mW\\;*\u0019wX;7L]\b\u0015(J[Z?#W\u0002\b")), method3565(method3564("\u0019oI6*J\u0002\b")), method3565(method3564("}AF;+P[\u0012z")), method3565(method3564("\u0019{x)|\u0019")), method3565(method3564("v[K63]]\b\u0019'U[\b\u000e)VS\u0012z")), method3565(method3564("LK")), method3565(method3564("mW\\;*\u0019lZ;(J\u0018g45ZJM?(\u0003\u0018")), method3565(method3564("H_\u0006f/WQ\\dn")), method3565(method3564("H_\u0006\u0018n")), method3565(method3564("H_\u0006\u001cn"))};
   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7011 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!qg",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field7016 = new int[8];
   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "[S"
   )
   public static short[] field7021 = new short[]{19, 18, 5, 10, 57, 23, 30, 12};
   @OriginalMember(
      owner = "client!qg",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field7020 = new int[8];
   @OriginalMember(
      owner = "client!qg",
      name = "j",
      descriptor = "I"
   )
   public static int field7014;
   @OriginalMember(
      owner = "client!qg",
      name = "e",
      descriptor = "I"
   )
   public static int field7018;
   @OriginalMember(
      owner = "client!qg",
      name = "f",
      descriptor = "Lkf;"
   )
   public static class266 field7013;
   @OriginalMember(
      owner = "client!qg",
      name = "d",
      descriptor = "Lbl;"
   )
   public static class678 field7019;

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3560() {
      byte var0 = 10;
      byte var1 = 30;
      if (class503.field7307 != 0 && class607.field8908 != null) {
         class80.field1038.method605(class692.field10186);

         for(int var2 = 0; var2 < class652.field9556.length; ++var2) {
            class80.field1038.method585(class692.field10186[1], class652.field9556[var2] + class493.field7039[var2], true, class692.field10186[3] - class692.field10186[1], -256);
         }

         for(int var3 = 0; var3 < class787.field11559; ++var3) {
            class311 var11 = class443.field6309[var3];
            class80.field1038.method551(var11.field4274[0], var11.field4265[0], var11.field4271[0], class412.field5948);
            class80.field1038.method551(var11.field4274[1], var11.field4265[1], var11.field4271[1], class463.field6644);
            class80.field1038.method551(var11.field4274[2], var11.field4265[2], var11.field4271[2], class373.field5406);
            class80.field1038.method551(var11.field4274[3], var11.field4265[3], var11.field4271[3], class426.field6114);
            if (class412.field5948[2] != -1 && class463.field6644[2] != -1 && class373.field5406[2] != -1 && class426.field6114[2] != -1) {
               int var12 = -65536;
               if (var11.field4262 == 4) {
                  var12 = -16776961;
               }

               class80.field1038.method568((byte)-6, var12, class463.field6644[1], class412.field5948[0], class463.field6644[0], class412.field5948[1]);
               class80.field1038.method568((byte)-6, var12, class373.field5406[1], class463.field6644[0], class373.field5406[0], class463.field6644[1]);
               class80.field1038.method568((byte)-6, var12, class426.field6114[1], class373.field5406[0], class426.field6114[0], class373.field5406[1]);
               class80.field1038.method568((byte)-6, var12, class412.field5948[1], class426.field6114[0], class412.field5948[0], class426.field6114[1]);
               class80.field1038.method568((byte)-6, var12, class373.field5406[1], class412.field5948[0], class373.field5406[0], class412.field5948[1]);
            }
         }

         class607.field8908.method620(0, var0, -16777216, var1 + 45, -256, field7022[7] + class274.field3764 + "/" + 5000);
         class607.field8908.method620(0, var0, -16777216, var1 + 60, -256, field7022[5] + class614.field9023 + "/" + 10000);
         class607.field8908.method620(0, var0, -16777216, var1 + 75, -256, field7022[11] + class616.field9062 + "/" + 5000);
         class607.field8908.method620(0, var0, -16777216, var1 + 90, -256, field7022[3] + (class545.field7817 + class288.field4000) + field7022[2] + class787.field11559);
         class607.field8908.method620(0, var0, -16777216, var1 + 105, -256, field7022[1] + class216.field3088 + field7022[6] + class428.field6129 + field7022[8] + class20.field225 + field7022[4] + class330.field4497);
         class607.field8908.method620(0, var0, -16777216, var1 + 120, -256, field7022[9] + class31.field443 / 1000L + field7022[10]);
         if (class503.field7307 == 2 && class139.field1774 != null) {
            for(int var4 = 0; var4 < class139.field1774.length; ++var4) {
               float var6 = (float)class139.field1774[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class139.field1774[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class492 var5 = class80.field1038.method548(-19069, class408.field5905, class139.field1774, class533.field7596, class533.field7596, 0);
            var5.method429(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method1644(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3561(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 90) {
            return true;
         } else {
            ++field7018;
            return ~(arg1 & 65536) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7022[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class490(int arg0, int arg1, int arg2) {
      try {
         this.field7015 = arg0;
         this.field7012 = arg1;
         this.field7017 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7022[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "(III)V"
   )
   public abstract void method1645(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method1646(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(BI)Lct;"
   )
   public static final class157 method3562(byte arg0, int arg1) {
      try {
         ++field7014;
         if (arg0 != -111) {
            method3562((byte)3, -111);
         }

         return ~arg1 <= -1 && arg1 < 100 ? class377.field5448[arg1] : null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7022[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3563(byte arg0) {
      try {
         field7011 = null;
         field7021 = null;
         field7019 = null;
         field7016 = null;
         field7013 = null;
         if (arg0 < 74) {
            method3560();
         }

         field7020 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3564(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3565(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class695 {
   @OriginalMember(
      owner = "client!ua",
      name = "k",
      descriptor = "S"
   )
   public short field10198;
   @OriginalMember(
      owner = "client!ua",
      name = "j",
      descriptor = "Z"
   )
   public boolean field10201;
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "I"
   )
   public int field10204;
   @OriginalMember(
      owner = "client!ua",
      name = "i",
      descriptor = "B"
   )
   public byte field10195;
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "B"
   )
   public byte field10203;
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "I"
   )
   public int field10193;
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "S"
   )
   public short field10194;
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "S"
   )
   public short field10202;
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10206 = new String[]{method5065(method5064(">\u0007eyg")), method5065(method5064("%\u0013'W")), method5065(method5064("0He\u00152")), method5065(method5064(">\u0007exg")), method5065(method5064(">\u0007e~g")), method5065(method5064(">\u0007e\u0007&%\u000f?\u0005g")), method5065(method5064(">\u0007ezg")), method5065(method5064(">\u0007e\u007fg"))};
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field10200 = new class536(12, 3);
   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "I"
   )
   public static int field10196;
   @OriginalMember(
      owner = "client!ua",
      name = "l",
      descriptor = "I"
   )
   public static int field10197;
   @OriginalMember(
      owner = "client!ua",
      name = "m",
      descriptor = "I"
   )
   public static int field10199;
   @OriginalMember(
      owner = "client!ua",
      name = "h",
      descriptor = "I"
   )
   public static int field10205;

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lbda;I)V"
   )
   public static final void method5059(class534 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(IIBLkf;)Lio;"
   )
   public static final class464 method5060(int arg0, int arg1, byte arg2, class266 arg3) {
      try {
         if (arg2 > -1) {
            method5059((class534)null, -30);
         }

         ++field10197;
         byte[] var4 = arg3.method2037(false, arg1, arg0);
         return var4 == null ? null : new class464(var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10206[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10206[2] : field10206[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5061(byte arg0) {
      try {
         field10200 = null;
         if (arg0 <= 112) {
            method5063((byte)-11, (class66)null, -121, (class311)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10206[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lrv;Ldea;IIILlia;II)V"
   )
   public static final void method5062(class121 arg0, class259 arg1, int arg2, int arg3, int arg4, class506 arg5, int arg6, int arg7) {
      try {
         ++field10196;
         if (arg6 != 256) {
            field10200 = null;
         }

         class460 var8 = new class460();
         var8.field6628 = arg4 << 9;
         var8.field6618 = arg3 << 9;
         var8.field6630 = arg2;
         if (arg1 == null) {
            if (arg5 == null) {
               if (arg0 != null) {
                  var8.field6626 = arg0;
                  var8.field6620 = arg0.method972(arg6 + -257) + arg4 << 9;
                  var8.field6605 = arg0.method972(-1) + arg3 << 9;
                  var8.field6611 = class566.method4032(arg0, -1);
                  var8.field6607 = arg0.field1553;
                  var8.field6606 = 256;
                  var8.field6634 = 256;
                  var8.field6627 = 0;
                  var8.field6602 = arg0.field1546 << 9;
                  var8.field6615 = arg0.field1551;
                  class9.field89.method336(-1, (long)arg0.field3862, var8);
                  return;
               }
            } else {
               var8.field6624 = arg5;
               class745 var9 = arg5.field7333;
               if (var9.field10912 != null) {
                  var8.field6612 = true;
                  var9 = var9.method5405(class21.field248, -24);
               }

               if (var9 != null) {
                  var8.field6605 = var9.field10909 + arg3 << 9;
                  var8.field6620 = var9.field10909 + arg4 << 9;
                  var8.field6611 = class262.method1999((byte)-89, arg5);
                  var8.field6634 = var9.field10893;
                  var8.field6627 = var9.field10903 << 9;
                  var8.field6606 = var9.field10857;
                  var8.field6607 = var9.field10880;
                  var8.field6615 = var9.field10859;
                  var8.field6602 = var9.field10863 << 9;
               }

               class119.field1488.method2930((byte)-40, var8);
            }

         } else {
            var8.field6604 = arg1;
            int var10 = arg1.field3595;
            int var11 = arg1.field3583;
            if (~arg7 == -2 || ~arg7 == -4) {
               var11 = arg1.field3595;
               var10 = arg1.field3583;
            }

            var8.field6606 = arg1.field3528;
            var8.field6615 = arg1.field3508;
            var8.field6611 = arg1.field3529;
            var8.field6608 = arg1.field3525;
            var8.field6610 = arg1.field3581;
            var8.field6627 = arg1.field3527 << 9;
            var8.field6623 = arg1.field3507;
            var8.field6607 = arg1.field3575;
            var8.field6605 = arg3 + var11 << 9;
            var8.field6617 = arg1.field3548;
            var8.field6602 = arg1.field3598 << 9;
            var8.field6620 = arg4 + var10 << 9;
            var8.field6634 = arg1.field3591;
            if (arg1.field3539 != null) {
               var8.field6612 = true;
               var8.method3350(arg6 + -256);
            }

            if (var8.field6617 != null) {
               var8.field6619 = var8.field6608 - -((int)((double)(-var8.field6608 + var8.field6623) * Math.random()));
            }

            class522.field7503.method2930((byte)-65, var8);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10206[3] + (arg0 != null ? field10206[2] : field10206[1]) + ',' + (arg1 != null ? field10206[2] : field10206[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10206[2] : field10206[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(BLha;ILnka;)V"
   )
   public static final void method5063(byte param0, class66 param1, int param2, class311 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ua",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field10198 = (short)arg5;
         this.field10201 = arg9;
         this.field10204 = arg0;
         this.field10195 = (byte)arg8;
         this.field10203 = (byte)arg7;
         this.field10193 = arg10;
         this.field10194 = (short)arg6;
         this.field10202 = (short)arg4;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10206[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5064(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5065(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

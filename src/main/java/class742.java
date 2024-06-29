import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public abstract class class742 extends class616 {
   @OriginalMember(
      owner = "client!fka",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11015 = new String[]{method5409(method5408("=p9!Zs")), method5409(method5408(" 5v!f")), method5409(method5408("5n4c")), method5409(method5408("=p9!Xs")), method5409(method5408("=p9!\\s")), method5409(method5408("=p9!^s")), method5409(method5408("=p9!_s")), method5409(method5408("=p9!Ys")), method5409(method5408("=p9!'2u1{%s")), method5409(method5408("=p9!]s")), method5409(method5408("=p9!Rs")), method5409(method5408("=p9!Ss"))};
   @OriginalMember(
      owner = "client!fka",
      name = "G",
      descriptor = "Lma;"
   )
   public static class14 field11009 = new class14();
   @OriginalMember(
      owner = "client!fka",
      name = "y",
      descriptor = "I"
   )
   public static int field11006;
   @OriginalMember(
      owner = "client!fka",
      name = "H",
      descriptor = "I"
   )
   public static int field11007;
   @OriginalMember(
      owner = "client!fka",
      name = "C",
      descriptor = "I"
   )
   public static int field11008;
   @OriginalMember(
      owner = "client!fka",
      name = "D",
      descriptor = "I"
   )
   public static int field11010;
   @OriginalMember(
      owner = "client!fka",
      name = "B",
      descriptor = "I"
   )
   public static int field11011;
   @OriginalMember(
      owner = "client!fka",
      name = "F",
      descriptor = "I"
   )
   public static int field11012;
   @OriginalMember(
      owner = "client!fka",
      name = "E",
      descriptor = "I"
   )
   public static int field11013;
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "I"
   )
   public static int field11014;

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(ILha;IZIBLvs;)V"
   )
   public final void method18(int arg0, class66 arg1, int arg2, boolean arg3, int arg4, byte arg5, class616 arg6) {
      try {
         ++field11007;
         if (arg5 >= 91) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11015[4] + arg0 + ',' + (arg1 != null ? field11015[1] : field11015[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11015[1] : field11015[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(IIZIBII)V"
   )
   public static final void method5405(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         if (arg4 != -65) {
            method5405(13, -36, false, -100, (byte)-22, 86, 79);
         }

         class261.field3563 = arg6;
         class506.field7479 = arg5;
         class132.field1655 = arg1;
         ++field11010;
         class513.field7524 = arg3;
         class552.field8167 = arg0;
         if (arg2 && ~class261.field3563 <= -101) {
            class232.field2947 = class513.field7524 * 512 + 256;
            class731.field10844 = class552.field8167 * 512 - -256;
            class733.field10871 = class368.method2858(class232.field2947, (byte)-11, class731.field10844, class551.field8158) - class506.field7479;
         }

         class387.field5919 = -1;
         class57.field717 = -1;
         class675.field10142 = 2;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11015[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method19(byte arg0) {
      try {
         if (arg0 != 70) {
            this.method19((byte)84);
         }

         ++field11006;
         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11015[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "e",
      descriptor = "(B)V"
   )
   public static final void method5406(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fka",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method5407(byte arg0) {
      try {
         if (arg0 != 56) {
            method5406((byte)-40);
         }

         field11009 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11015[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1883(boolean arg0) {
      try {
         ++field11013;
         if (arg0) {
            field11009 = null;
         }

         return class569.field8487[(super.field9003 >> class459.field6950) + -class681.field10228 + class488.field7212][(super.field9007 >> class459.field6950) + (-class518.field7555 - -class488.field7212)];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11015[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         if (arg0 == 1) {
            ++field11014;
            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11015[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class742(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field9007 = arg2;
         super.field9005 = (byte)arg4;
         super.field8998 = arg1;
         super.field9010 = (byte)arg3;
         super.field9003 = arg0;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11015[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "([Llja;I)I"
   )
   public final int method1881(class744[] arg0, int arg1) {
      try {
         if (arg1 != -52) {
            method5406((byte)120);
         }

         ++field11011;
         return this.method4469(super.field9003 >> class459.field6950, arg0, super.field9007 >> class459.field6950, (byte)-5);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11015[5] + (arg0 != null ? field11015[1] : field11015[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(BLha;)Z"
   )
   public final boolean method1880(byte arg0, class66 arg1) {
      try {
         ++field11012;
         class389 var3 = class717.method5186(super.field9010, super.field9003 >> class459.field6950, super.field9007 >> class459.field6950);
         if (arg0 <= 63) {
            return true;
         } else {
            return var3 != null && var3.field5943.field10993 ? class488.method3620(var3.field5943.method11(0) - -this.method11(0), super.field9007 >> class459.field6950, (byte)114, super.field9010, super.field9003 >> class459.field6950) : class499.method3722(super.field9003 >> class459.field6950, super.field9010, 115, super.field9007 >> class459.field6950);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11015[0] + arg0 + ',' + (arg1 != null ? field11015[1] : field11015[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5408(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5409(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class712 {
   @OriginalMember(
      owner = "client!dga",
      name = "v",
      descriptor = "I"
   )
   public int field10239;
   @OriginalMember(
      owner = "client!dga",
      name = "h",
      descriptor = "I"
   )
   private int field10232;
   @OriginalMember(
      owner = "client!dga",
      name = "e",
      descriptor = "B"
   )
   public byte field10241;
   @OriginalMember(
      owner = "client!dga",
      name = "l",
      descriptor = "I"
   )
   public int field10220;
   @OriginalMember(
      owner = "client!dga",
      name = "j",
      descriptor = "I"
   )
   public int field10223;
   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10245 = new String[]{method5180(method5179("vtg-\u001c{}ow\u001e:")), method5180(method5179("vtg-a:")), method5180(method5179("|fjo")), method5180(method5179("vtg-b:")), method5180(method5179("i=(-]")), method5180(method5179("vtg-d:")), method5180(method5179("vtg-c:"))};
   @OriginalMember(
      owner = "client!dga",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10225 = new String[]{method5180(method5179("Xrh")), method5180(method5179("Tvd")), method5180(method5179("_rt")), method5180(method5179("Sct")), method5180(method5179("_r\u007f")), method5180(method5179("Xfh")), method5180(method5179("Xfj")), method5180(method5179("Sfa")), method5180(method5179("Avv")), method5180(method5179("]pr")), method5180(method5179("\\|p")), method5180(method5179("Vve"))};
   @OriginalMember(
      owner = "client!dga",
      name = "r",
      descriptor = "[F"
   )
   public static float[] field10238 = new float[2];
   @OriginalMember(
      owner = "client!dga",
      name = "s",
      descriptor = "I"
   )
   public static int field10235 = 0;
   @OriginalMember(
      owner = "client!dga",
      name = "w",
      descriptor = "I"
   )
   public static int field10221;
   @OriginalMember(
      owner = "client!dga",
      name = "d",
      descriptor = "I"
   )
   public int field10222;
   @OriginalMember(
      owner = "client!dga",
      name = "k",
      descriptor = "I"
   )
   public int field10226;
   @OriginalMember(
      owner = "client!dga",
      name = "i",
      descriptor = "I"
   )
   public static int field10227;
   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "I"
   )
   public static int field10228;
   @OriginalMember(
      owner = "client!dga",
      name = "u",
      descriptor = "I"
   )
   public int field10230;
   @OriginalMember(
      owner = "client!dga",
      name = "n",
      descriptor = "I"
   )
   public static int field10233;
   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "I"
   )
   public int field10234;
   @OriginalMember(
      owner = "client!dga",
      name = "t",
      descriptor = "I"
   )
   public int field10236;
   @OriginalMember(
      owner = "client!dga",
      name = "m",
      descriptor = "I"
   )
   public int field10237;
   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "I"
   )
   public int field10240;
   @OriginalMember(
      owner = "client!dga",
      name = "q",
      descriptor = "I"
   )
   public int field10242;
   @OriginalMember(
      owner = "client!dga",
      name = "f",
      descriptor = "I"
   )
   public int field10243;
   @OriginalMember(
      owner = "client!dga",
      name = "o",
      descriptor = "I"
   )
   public static int field10244;
   @OriginalMember(
      owner = "client!dga",
      name = "x",
      descriptor = "Lha;"
   )
   public static class17 field10231;
   @OriginalMember(
      owner = "client!dga",
      name = "y",
      descriptor = "Lsa;"
   )
   public static class39 field10224;
   @OriginalMember(
      owner = "client!dga",
      name = "p",
      descriptor = "Ldga;"
   )
   public class712 field10229;

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(IIII)Ldga;"
   )
   public final class712 method5175(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10221;
         if (arg0 != 4096) {
            method5177((byte)106);
         }

         return new class712(this.field10232, arg3, arg1, arg2, this.field10241);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10245[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(Z)Lfia;"
   )
   public final class351 method5176(boolean arg0) {
      try {
         ++field10227;
         return !arg0 ? null : class143.method1422(this.field10232, (byte)47);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10245[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5177(byte arg0) {
      try {
         field10238 = null;
         field10231 = null;
         field10224 = null;
         field10225 = null;
         if (arg0 >= -10) {
            field10235 = -79;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10245[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(Ljga;Lha;III)V"
   )
   public static final void method5178(class91 param0, class17 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dga",
      name = "<init>",
      descriptor = "(IIIIB)V"
   )
   public class712(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field10239 = arg2;
         this.field10232 = arg0;
         this.field10241 = arg4;
         this.field10220 = arg1;
         this.field10223 = arg3;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10245[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5179(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5180(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

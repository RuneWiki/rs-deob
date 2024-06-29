import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class668 {
   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9912 = new String[]{method4881(method4880("HAh")), method4881(method4880("NHu")), method4881(method4880("NXu")), method4881(method4880("M\tx")), method4881(method4880("M\u000f~")), method4881(method4880("M\u000f{")), method4881(method4880("NKy\"")), method4881(method4880("NKz\"")), method4881(method4880("\u000bQ!z \u001cX:m!\u001a\u0013?lq\u000b\u0000")), method4881(method4880("M\u000e)")), method4881(method4880("\u001c\\f[f")), method4881(method4880("\u0006H$s")), method4881(method4880("\u0013\u0013f13")), method4881(method4880("\u001c\\f\\f")), method4881(method4880("\u001c\\f^f"))};
   @OriginalMember(
      owner = "client!ta",
      name = "u",
      descriptor = "Laka;"
   )
   public static class418 field9888 = new class418(62, -2);
   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field9903 = false;
   @OriginalMember(
      owner = "client!ta",
      name = "t",
      descriptor = "B"
   )
   public byte field9887;
   @OriginalMember(
      owner = "client!ta",
      name = "y",
      descriptor = "B"
   )
   public byte field9889;
   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "B"
   )
   public byte field9891;
   @OriginalMember(
      owner = "client!ta",
      name = "h",
      descriptor = "B"
   )
   public byte field9900;
   @OriginalMember(
      owner = "client!ta",
      name = "i",
      descriptor = "B"
   )
   public byte field9905;
   @OriginalMember(
      owner = "client!ta",
      name = "o",
      descriptor = "B"
   )
   public byte field9909;
   @OriginalMember(
      owner = "client!ta",
      name = "g",
      descriptor = "B"
   )
   public byte field9911;
   @OriginalMember(
      owner = "client!ta",
      name = "f",
      descriptor = "I"
   )
   public static int field9892;
   @OriginalMember(
      owner = "client!ta",
      name = "p",
      descriptor = "I"
   )
   public int field9895;
   @OriginalMember(
      owner = "client!ta",
      name = "c",
      descriptor = "I"
   )
   public static int field9897;
   @OriginalMember(
      owner = "client!ta",
      name = "x",
      descriptor = "I"
   )
   public int field9898;
   @OriginalMember(
      owner = "client!ta",
      name = "q",
      descriptor = "I"
   )
   public int field9904;
   @OriginalMember(
      owner = "client!ta",
      name = "r",
      descriptor = "I"
   )
   public static int field9908;
   @OriginalMember(
      owner = "client!ta",
      name = "m",
      descriptor = "Lww;"
   )
   public static class339 field9907;
   @OriginalMember(
      owner = "client!ta",
      name = "n",
      descriptor = "S"
   )
   public short field9890;
   @OriginalMember(
      owner = "client!ta",
      name = "d",
      descriptor = "Z"
   )
   public boolean field9893;
   @OriginalMember(
      owner = "client!ta",
      name = "l",
      descriptor = "Z"
   )
   public boolean field9894;
   @OriginalMember(
      owner = "client!ta",
      name = "w",
      descriptor = "Z"
   )
   public boolean field9896;
   @OriginalMember(
      owner = "client!ta",
      name = "e",
      descriptor = "Z"
   )
   public boolean field9899;
   @OriginalMember(
      owner = "client!ta",
      name = "v",
      descriptor = "Z"
   )
   public boolean field9901;
   @OriginalMember(
      owner = "client!ta",
      name = "k",
      descriptor = "Z"
   )
   public boolean field9902;
   @OriginalMember(
      owner = "client!ta",
      name = "j",
      descriptor = "Z"
   )
   public boolean field9906;
   @OriginalMember(
      owner = "client!ta",
      name = "s",
      descriptor = "Z"
   )
   public boolean field9910;

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4876(int arg0) {
      try {
         field9907 = null;
         field9888 = null;
         if (arg0 <= 41) {
            field9903 = false;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9912[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V"
   )
   public static final void method4877(byte arg0, Throwable arg1, String arg2) {
      boolean var3 = client.field1481;
      ++field9892;

      try {
         int var4 = 63 / ((72 - arg0) / 54);
         String var5 = "";
         if (arg1 != null) {
            var5 = class559.method4212((byte)114, arg1);
         }

         if (arg2 != null) {
            if (arg1 != null) {
               var5 = var5 + field9912[0];
            }

            var5 = var5 + arg2;
         }

         class563.method4239(var5, (byte)-41);
         String var6 = class270.method2149(var5, field9912[9], ":", (byte)-18);
         String var7 = class270.method2149(var6, field9912[3], "@", (byte)-18);
         String var8 = class270.method2149(var7, field9912[4], "&", (byte)-18);
         String var9 = class270.method2149(var8, field9912[5], "#", (byte)-18);
         if (class428.field5816 != null) {
            class769 var10 = class171.field2224.method5335(0, new URL(class428.field5816.getCodeBase(), field9912[8] + class391.field5422 + field9912[1] + (class432.field5890 == null ? String.valueOf(class694.field10181) : class432.field5890) + field9912[6] + class736.field10732 + field9912[7] + class736.field10751 + field9912[2] + var9));
            if (var3) {
               class340.method2717(1L, (byte)-119);
            }

            while(~var10.field11210 == -1) {
               class340.method2717(1L, (byte)-119);
            }

            if (var10.field11210 == 1) {
               DataInputStream var11 = (DataInputStream)var10.field11212;
               var11.read();
               var11.close();
            }
         }
      } catch (Exception var12) {
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "([BB)[B"
   )
   public static final byte[] method4878(byte[] arg0, byte arg1) {
      try {
         ++field9897;
         if (arg0 == null) {
            return null;
         } else {
            byte[] var2 = new byte[arg0.length];
            class349.method2762(arg0, 0, var2, 0, arg0.length);
            if (arg1 != -76) {
               field9888 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9912[13] + (arg0 != null ? field9912[12] : field9912[11]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(Loca;ILoca;)V"
   )
   public static final void method4879(class642 arg0, int arg1, class642 arg2) {
      try {
         if (arg1 != 0) {
            field9903 = false;
         }

         ++field9908;
         ++class468.field6426;
         class702 var3 = class19.method142(class387.field5365.field8765, class43.field558, (byte)-128);
         var3.field10264.method649((byte)-124, arg0.field9482);
         var3.field10264.method611(arg2.field9518, -1344798296);
         var3.field10264.method607(arg1 + 127, arg0.field9524);
         var3.field10264.method643(false, arg0.field9518);
         var3.field10264.method619(arg1 + -103, arg2.field9482);
         var3.field10264.method643(false, arg2.field9524);
         class387.field5365.method4423(var3, (byte)106);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9912[14] + (arg0 != null ? field9912[12] : field9912[11]) + ',' + arg1 + ',' + (arg2 != null ? field9912[12] : field9912[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4880(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4881(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

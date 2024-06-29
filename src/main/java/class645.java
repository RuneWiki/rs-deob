import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class645 {
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9083 = new String[]{method4696(method4695("{[\u001b\u0003\u0018")), method4696(method4695("{[\u001b\u0005\u0018")), method4696(method4695("{[\u001b\u0006\u0018")), method4696(method4695("t\u001e\u001biM")), method4696(method4695("aEY+")), method4696(method4695("{[\u001b\u0004\u0018"))};
   @OriginalMember(
      owner = "client!tk",
      name = "h",
      descriptor = "[Lrl;"
   )
   public static class343[] field9076 = new class343[8];
   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "I"
   )
   public static int field9077;
   @OriginalMember(
      owner = "client!tk",
      name = "i",
      descriptor = "I"
   )
   public static int field9080;
   @OriginalMember(
      owner = "client!tk",
      name = "d",
      descriptor = "I"
   )
   public static int field9081;
   @OriginalMember(
      owner = "client!tk",
      name = "e",
      descriptor = "I"
   )
   public static int field9082;
   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field9075;
   @OriginalMember(
      owner = "client!tk",
      name = "g",
      descriptor = "[S"
   )
   public short[] field9074;
   @OriginalMember(
      owner = "client!tk",
      name = "f",
      descriptor = "[S"
   )
   public short[] field9078;
   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "[S"
   )
   public short[] field9079;

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(Lcu;Lfea;BI)V"
   )
   public static final void method4691(class65 param0, class82 param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4692(int arg0) {
      try {
         class585.field8203 = arg0;
         class793.field11537 = 1;
         class527.field7461 = class745.field10604;
         ++field9082;
         class216.method1867("", true, class704.field10134.equals(""), ~arg0, class704.field10134);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9083[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4693(int arg0) {
      try {
         field9076 = null;
         if (arg0 != -4) {
            method4692(-44);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9083[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method4694(int arg0, byte arg1) {
      try {
         int var4 = arg0 - 1;
         ++field9081;
         if (arg1 >= -127) {
            method4692(12);
         }

         var4 |= var4 >>> 1;
         var4 |= var4 >>> 2;
         var4 |= var4 >>> 4;
         var4 |= var4 >>> 8;
         var4 |= var4 >>> 16;
         return var4 - -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9083[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4695(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4696(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

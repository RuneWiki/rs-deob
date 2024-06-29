import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class710 {
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10362 = new String[]{method5167(method5166("FAWl1")), method5167(method5166("H\t\u0018l\u000e\u0015")), method5167(method5166("S\u001a\u0015.")), method5167(method5166("H\t\u0018l\r\u0015"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   public static int field10360 = 0;
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "I"
   )
   public static int field10359;
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "I"
   )
   public static int field10361;

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(ILkf;)V",
      line = 5
   )
   public static final void method5164(int arg0, class266 arg1) {
      try {
         if (arg0 != 0) {
            field10360 = -21;
         }

         class87.field1138 = arg1;
         ++field10361;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10362[3] + arg0 + ',' + (arg1 != null ? field10362[0] : field10362[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(BLwf;)Lpq;",
      line = 18
   )
   public static final class207 method5165(byte arg0, class147 arg1) {
      try {
         int var2 = 56 % ((arg0 - 19) / 32);
         ++field10359;
         return new class207(arg1.method1187((byte)108), arg1.method1187((byte)106), arg1.method1187((byte)-110), arg1.method1187((byte)-71), arg1.method1166((byte)-46), arg1.method1143(-15465));
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10362[1] + arg0 + ',' + (arg1 != null ? field10362[0] : field10362[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5166(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5167(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class642 {
   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "B"
   )
   public byte field9357;
   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "S"
   )
   public short field9355;
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "B"
   )
   public byte field9359;
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "Lpv;"
   )
   public class77 field9358;
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9360 = new String[]{method4703(method4702("1\u001aLjx2\u001dD0zs")), method4703(method4702(" ]\u0003j9")), method4703(method4702("5\u0006A(")), method4703(method4702("1\u001aLj\u0005s"))};
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "I"
   )
   public static int field9354;
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "I"
   )
   public static int field9356;

   @OriginalMember(
      owner = "client!jia",
      name = "<init>",
      descriptor = "(Lpv;III)V",
      line = 11
   )
   public class642(class77 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9357 = (byte)arg3;
         this.field9355 = (short)arg1;
         this.field9359 = (byte)arg2;
         this.field9358 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9360[0] + (arg0 != null ? field9360[1] : field9360[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(BII)I",
      line = 23
   )
   public static final int method4701(byte arg0, int arg1, int arg2) {
      try {
         ++field9356;
         int var3 = arg1 + -1 & arg2 >> 31;
         if (arg0 < 49) {
            field9354 = 27;
         }

         return ((arg2 >>> 31) + arg2) % arg1 + var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9360[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4703(char[] arg0) {
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
            var10005 = 115;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

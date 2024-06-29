import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class559 {
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8324 = new String[]{method4231(method4230("x\u001d*4;")), method4231(method4230("p@*Xn")), method4231(method4230("mFhv")), method4231(method4230("p@*[n"))};
   @OriginalMember(
      owner = "client!ss",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8318 = null;
   @OriginalMember(
      owner = "client!ss",
      name = "k",
      descriptor = "I"
   )
   public int field8312;
   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "I"
   )
   public int field8313;
   @OriginalMember(
      owner = "client!ss",
      name = "j",
      descriptor = "I"
   )
   public static int field8314;
   @OriginalMember(
      owner = "client!ss",
      name = "f",
      descriptor = "I"
   )
   public int field8316;
   @OriginalMember(
      owner = "client!ss",
      name = "d",
      descriptor = "I"
   )
   public int field8317;
   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "I"
   )
   public int field8319;
   @OriginalMember(
      owner = "client!ss",
      name = "g",
      descriptor = "I"
   )
   public int field8321;
   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "I"
   )
   public int field8322;
   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "I"
   )
   public static int field8323;
   @OriginalMember(
      owner = "client!ss",
      name = "h",
      descriptor = "[B"
   )
   public byte[] field8315;
   @OriginalMember(
      owner = "client!ss",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field8320;

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4228(byte arg0) {
      try {
         field8318 = null;
         if (arg0 >= -56) {
            method4228((byte)16);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8324[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(BILha;III)V",
      line = 21
   )
   public static final void method4229(byte arg0, int arg1, class610 arg2, int arg3, int arg4, int arg5) {
      try {
         class450.field6888 = arg2;
         ++field8314;
         if (arg0 <= 110) {
            method4228((byte)-94);
         }

         class691.field10264 = class450.field6888.method624();
         class412.field6408 = class450.field6888.method624();
         class640.field9279 = class450.field6888.method624();
         class276.field4410 = null;
         class263.field4324 = arg1;
         class67.field883 = 0;
         class35.field423 = null;
         class1.field7 = arg3;
         class6.method26(false, arg5, arg4);
         class662.field9929 = -1;
         class560.field8328 = -1;
         class200.field3072 = -1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8324[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8324[0] : field8324[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4230(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4231(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

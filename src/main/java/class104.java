import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class104 implements class261 {
   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "Lpm;"
   )
   private class611 field1324;
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1326 = new String[]{method864(method863("\u001e?*)BF")), method864(method863("\u0015xe){")), method864(method863("\u001e?*):\u00078\"s8F")), method864(method863("\u0000#'k")), method864(method863("\u001e?*)NF")), method864(method863("\u001e?*)GF"))};
   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "I"
   )
   public static int field1322;
   @OriginalMember(
      owner = "client!pia",
      name = "d",
      descriptor = "I"
   )
   public static int field1323;
   @OriginalMember(
      owner = "client!pia",
      name = "c",
      descriptor = "I"
   )
   public static int field1325;

   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "(I)Z",
      line = 3
   )
   public final boolean method860(int arg0) {
      try {
         ++field1323;
         if (arg0 != 9201) {
            this.method861((byte)-100, false);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1326[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(BZ)V",
      line = 18
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         ++field1322;
         if (arg1) {
            class383.field5543.method496(0, 0, class237.field3310, class692.field10185, this.field1324.field8970, 0);
         }

         int var3 = -46 / ((arg0 - -31) / 44);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1326[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "<init>",
      descriptor = "(Lpm;)V",
      line = 29
   )
   public class104(class611 arg0) {
      try {
         this.field1324 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1326[2] + (arg0 != null ? field1326[1] : field1326[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(I)V",
      line = 37
   )
   public final void method862(int arg0) {
      try {
         if (arg0 != -23681) {
            this.field1324 = null;
         }

         ++field1325;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1326[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method864(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

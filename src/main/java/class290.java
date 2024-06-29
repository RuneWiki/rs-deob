import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public abstract class class290 {
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4018 = new String[]{method2188(method2187("\fuSJ\u000bR")), method2188(method2187("\fuSJ\rR")), method2188(method2187("\fuSJ\fR")), method2188(method2187("\fuSJ\nR"))};
   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "I"
   )
   public static int field4011;
   @OriginalMember(
      owner = "client!vja",
      name = "d",
      descriptor = "I"
   )
   public static int field4012;
   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "I"
   )
   public static int field4013;
   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "I"
   )
   public static int field4014;
   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "I"
   )
   public static int field4015;
   @OriginalMember(
      owner = "client!vja",
      name = "g",
      descriptor = "Lkda;"
   )
   public static class412 field4016;
   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4017;

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(IIIZI)Ltp;",
      line = 3
   )
   public static final class561 method2183(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field4013;
         int var5 = -105 % ((arg0 - -18) / 46);
         class561 var6 = new class561();
         var6.field8020 = arg1;
         var6.field8021 = arg2;
         class191.field2708.method336(-1, (long)arg4, var6);
         class786.method5671(arg2, 0);
         class678 var7 = class602.method4379((byte)-123, arg4);
         if (var7 != null) {
            class743.method5384(var7, (byte)-117);
         }

         if (class602.field8848 != null) {
            class743.method5384(class602.field8848, (byte)-103);
            class602.field8848 = null;
         }

         class64.method483((byte)-128);
         if (var7 != null) {
            class132.method1045(!arg3, var7, 106);
         }

         if (!arg3) {
            class200.method1591(arg2);
         }

         if (!arg3 && ~class185.field2623 != 0) {
            class515.method3750(class185.field2623, 1, true);
         }

         return var6;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4018[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(B)V",
      line = 47
   )
   public static void method2184(byte arg0) {
      try {
         field4016 = null;
         int var1 = -21 % ((13 - arg0) / 56);
         field4017 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4018[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(III)Z",
      line = 63
   )
   public static final boolean method2185(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 31695) {
            return false;
         } else {
            ++field4012;
            return ~(2048 & arg1) != -1 && (55 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4018[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 78
   )
   public static final void method2186(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method394(int arg0);

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2188(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

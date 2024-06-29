import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class287 {
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3980 = new String[]{method2334(method2333("\u000f,Yz")), method2334(method2333("\u000f,Xz")), method2334(method2333("\u000f,Zz")), method2334(method2333("\u0012,5|u")), method2334(method2333("\u0007ww>"))};
   @OriginalMember(
      owner = "client!f",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field3971 = false;
   @OriginalMember(
      owner = "client!f",
      name = "l",
      descriptor = "I"
   )
   public static int field3975 = -1;
   @OriginalMember(
      owner = "client!f",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field3970 = new class6(58, -1);
   @OriginalMember(
      owner = "client!f",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field3979 = true;
   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "I"
   )
   public static int field3968;
   @OriginalMember(
      owner = "client!f",
      name = "i",
      descriptor = "I"
   )
   public int field3969;
   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "I"
   )
   public int field3972;
   @OriginalMember(
      owner = "client!f",
      name = "j",
      descriptor = "I"
   )
   public int field3973;
   @OriginalMember(
      owner = "client!f",
      name = "d",
      descriptor = "I"
   )
   public int field3974;
   @OriginalMember(
      owner = "client!f",
      name = "h",
      descriptor = "I"
   )
   public int field3976;
   @OriginalMember(
      owner = "client!f",
      name = "g",
      descriptor = "I"
   )
   public static int field3977;
   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "I"
   )
   public int field3978;

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2330(byte arg0) {
      try {
         if (arg0 >= -78) {
            method2331((byte)-43, (class102)null, (class339)null);
         }

         field3970 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3980[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(BLd;Lww;)V"
   )
   public static final void method2331(byte arg0, class102 arg1, class339 arg2) {
      try {
         ++field3968;
         if (arg0 != 23) {
            method2331((byte)28, (class102)null, (class339)null);
         }

         class484.field6738 = arg1;
         class323.field4419 = arg2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3980[2] + arg0 + ',' + (arg1 != null ? field3980[3] : field3980[4]) + ',' + (arg2 != null ? field3980[3] : field3980[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method2332(byte arg0, int arg1, int arg2) {
      try {
         ++field3977;
         if (~arg2 != -2 && ~arg2 != -4) {
            if (arg0 != 45) {
               method2332((byte)-16, -17, -86);
            }

            return class791.field11574[3 & arg1];
         } else {
            return class228.field2852[3 & arg1];
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3980[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2333(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2334(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

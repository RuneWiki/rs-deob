import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class721 {
   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "I"
   )
   public int field10734;
   @OriginalMember(
      owner = "client!cj",
      name = "h",
      descriptor = "I"
   )
   public int field10730;
   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "I"
   )
   public int field10736;
   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "I"
   )
   public int field10731;
   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10737 = new String[]{method5225(method5224("fxV\r\rk{\f\u000fL")), method5225(method5224("fxVpL")), method5225(method5224("fxVsL")), method5225(method5224("fxVE\u000bVf\nX\nb:"))};
   @OriginalMember(
      owner = "client!cj",
      name = "g",
      descriptor = "I"
   )
   public static int field10729 = 0;
   @OriginalMember(
      owner = "client!cj",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field10733 = false;
   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "I"
   )
   public static int field10728;
   @OriginalMember(
      owner = "client!cj",
      name = "i",
      descriptor = "I"
   )
   public static int field10732;
   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "I"
   )
   public static int field10735;

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(II)Ljf;"
   )
   public static final class225 method5222(int arg0, int arg1) {
      try {
         ++field10728;
         class225 var2 = (class225)class661.field9573.method5454((long)arg1, 18261);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class705.field10555.method3899(arg0 ^ -125, arg1, 1);
            class225 var4 = new class225();
            if (arg0 != 0) {
               method5222(0, 9);
            }

            var4.field2884 = arg1;
            if (var3 != null) {
               var4.method1701(0, new class128(var3));
            }

            var4.method1704((byte)-18);
            if (var4.field2890 == 2 && class367.field5523.method5681((long)arg1, -1) == null) {
               class367.field5523.method5682((long)arg1, new class10(class713.field10639), (byte)7);
               class483.field7171[class713.field10639++] = var4;
            }

            class661.field9573.method5455(-2049, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10737[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10735;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10737[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(I)[Lwm;"
   )
   public static final class590[] method5223(int arg0) {
      try {
         if (arg0 > -99) {
            field10729 = 45;
         }

         ++field10732;
         return new class590[]{class278.field3879, class781.field11403, class793.field11536};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10737[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class721(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10734 = arg1;
         this.field10730 = arg2;
         this.field10736 = arg0;
         this.field10731 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10737[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5224(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5225(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class768 extends class351 implements class732 {
   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "I"
   )
   private int field11073;
   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11081 = new String[]{method5505(method5504(";\u001a\u000eaJ")), method5505(method5504(";\u001a\u000e`J")), method5505(method5504(";\u001a\u000ekJ")), method5505(method5504("3\u0002LF")), method5505(method5504(";\u001a\u000e\u0016\u000b3\u001eT\u0014J")), method5505(method5504("&Y\u000e\u0004\u001f")), method5505(method5504(";\u001a\u000ecJ")), method5505(method5504(";\u001a\u000ebJ"))};
   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "I"
   )
   public static int field11079 = -1;
   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "I"
   )
   public static int field11074;
   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "I"
   )
   public static int field11075;
   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "I"
   )
   public static int field11076;
   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "I"
   )
   public static int field11078;
   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "[Lbo;"
   )
   public static class763[] field11077;

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method4375(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         ++field11078;
         if (arg3 == -21583) {
            this.method2766(arg2, arg0);
            this.field11073 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11081[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11081[5] : field11081[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method4377(int arg0) {
      try {
         if (arg0 <= 42) {
            return 24L;
         } else {
            ++field11080;
            return super.field5021.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11081[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(Lor;I[BI)V"
   )
   public class768(class670 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field11073 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11081[4] + (arg0 != null ? field11081[5] : field11081[3]) + ',' + arg1 + ',' + (arg2 != null ? field11081[5] : field11081[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method4381(int arg0) {
      try {
         ++field11076;
         return arg0 != 29894 ? -120 : 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11081[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5503(byte arg0) {
      try {
         if (arg0 != 19) {
            method5503((byte)-1);
         }

         field11077 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11081[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4376(byte arg0) {
      try {
         ++field11075;
         int var2 = -32 % ((-21 - arg0) / 59);
         return this.field11073;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11081[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

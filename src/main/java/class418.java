import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class418 {
   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "I"
   )
   public int field5718;
   @OriginalMember(
      owner = "client!aka",
      name = "c",
      descriptor = "I"
   )
   private int field5717;
   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5719 = new String[]{method3263(method3262("\u001f\u0012\u0000&\u000e\u0011*\u0015z\u0013\u0010\u001eI")), method3263(method3262("\u001f\u0012\u0000&9V")), method3263(method3262("\u001f\u0012\u0000&F\u0017\u0017\b|DV")), method3263(method3262("\u001f\u0012\u0000&;V")), method3263(method3262("\u001f\u0012\u0000&8V"))};
   @OriginalMember(
      owner = "client!aka",
      name = "g",
      descriptor = "I"
   )
   public static int field5713 = 0;
   @OriginalMember(
      owner = "client!aka",
      name = "h",
      descriptor = "I"
   )
   public static int field5711;
   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "I"
   )
   public static int field5712;
   @OriginalMember(
      owner = "client!aka",
      name = "f",
      descriptor = "I"
   )
   public static int field5714;
   @OriginalMember(
      owner = "client!aka",
      name = "e",
      descriptor = "I"
   )
   public static int field5715;
   @OriginalMember(
      owner = "client!aka",
      name = "d",
      descriptor = "Liba;"
   )
   public static class237 field5716;

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3259(int arg0, int arg1, int arg2) {
      try {
         ++field5712;
         if (arg2 != 18003) {
            field5716 = null;
         }

         class487 var3 = class2.method12((long)arg0, 14, (byte)43);
         var3.method3694(-21792);
         var3.field6794 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5719[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5714;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5719[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3260(int arg0) {
      try {
         ++field5711;
         if (arg0 >= -92) {
            method3259(78, -86, 33);
         }

         return this.field5717;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5719[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3261(byte arg0) {
      try {
         int var1 = -56 / ((arg0 - -22) / 60);
         field5716 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5719[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class418(int arg0, int arg1) {
      try {
         this.field5718 = arg1;
         this.field5717 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5719[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

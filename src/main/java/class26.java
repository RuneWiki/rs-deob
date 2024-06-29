import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class26 extends class454 {
   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field400 = new String[]{method207(method206("\u001bt\u00195\u0000")), method207(method206("\u001bt\u00194\u0000")), method207(method206("\u001bt\u00190\u0000")), method207(method206("\u001bt\u00192\u0000")), method207(method206("\u001bt\u00196\u0000")), method207(method206("\u001bt\u00191\u0000"))};
   @OriginalMember(
      owner = "client!uv",
      name = "i",
      descriptor = "I"
   )
   public static int field392;
   @OriginalMember(
      owner = "client!uv",
      name = "n",
      descriptor = "I"
   )
   public static int field393;
   @OriginalMember(
      owner = "client!uv",
      name = "l",
      descriptor = "I"
   )
   public static int field394;
   @OriginalMember(
      owner = "client!uv",
      name = "o",
      descriptor = "I"
   )
   public static int field395;
   @OriginalMember(
      owner = "client!uv",
      name = "m",
      descriptor = "I"
   )
   public static int field396;
   @OriginalMember(
      owner = "client!uv",
      name = "k",
      descriptor = "I"
   )
   public static int field397;
   @OriginalMember(
      owner = "client!uv",
      name = "j",
      descriptor = "I"
   )
   public static int field398;
   @OriginalMember(
      owner = "client!uv",
      name = "p",
      descriptor = "I"
   )
   public static int field399;

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            field392 = 92;
         }

         ++field393;
         return 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field400[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field395;
         if (arg1) {
            field392 = 79;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field400[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method204(int arg0) {
      try {
         if (arg0 != -18033) {
            this.method20((byte)123, 75);
         }

         ++field397;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field400[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method205(int arg0, int arg1, int arg2) {
      try {
         ++field396;
         int var3 = 110 % ((arg1 - 58) / 60);
         class487 var4 = class2.method12((long)arg2, 12, (byte)43);
         var4.method3694(-21792);
         var4.field6794 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field400[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class26(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         ++field394;
         if (arg0 >= -46) {
            this.method20((byte)85, 28);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field400[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field398;
         if (super.field6259.field10977.method1765(1) && ~super.field6263 == -3) {
            super.field6263 = 1;
         }

         if (~super.field6263 > -1 || ~super.field6263 < -3) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            field392 = 110;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field400[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class26(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method206(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method207(char[] arg0) {
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
            var10005 = 2;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

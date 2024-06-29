import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class749 extends class465 {
   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11107 = new String[]{method5467(method5466("Z*F\u0015\u0018")), method5467(method5466("Z*F\u0011\u0018")), method5467(method5466("Z*F\u0014\u0018")), method5467(method5466("Z*F\u0017\u0018")), method5467(method5466("Z*F\u0010\u0018")), method5467(method5466("Z*F\u0016\u0018")), method5467(method5466("Z*F\u0012\u0018"))};
   @OriginalMember(
      owner = "client!jn",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field11103 = new class101(92, 12);
   @OriginalMember(
      owner = "client!jn",
      name = "k",
      descriptor = "Lsda;"
   )
   public static class269 field11105 = new class269(70, 3);
   @OriginalMember(
      owner = "client!jn",
      name = "g",
      descriptor = "I"
   )
   public static int field11098;
   @OriginalMember(
      owner = "client!jn",
      name = "i",
      descriptor = "I"
   )
   public static int field11099;
   @OriginalMember(
      owner = "client!jn",
      name = "j",
      descriptor = "I"
   )
   public static int field11100;
   @OriginalMember(
      owner = "client!jn",
      name = "f",
      descriptor = "I"
   )
   public static int field11101;
   @OriginalMember(
      owner = "client!jn",
      name = "m",
      descriptor = "I"
   )
   public static int field11102;
   @OriginalMember(
      owner = "client!jn",
      name = "n",
      descriptor = "I"
   )
   public static int field11104;
   @OriginalMember(
      owner = "client!jn",
      name = "l",
      descriptor = "I"
   )
   public static int field11106;

   @OriginalMember(
      owner = "client!jn",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class749(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field11101;
         int var3 = 82 % ((arg1 - -51) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11107[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            method5463((byte)33);
         }

         ++field11099;
         return 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11107[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         if (arg0 != -14812) {
            this.method77(-39, 18);
         }

         ++field11104;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11107[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5463(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jn",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class749(int arg0, class648 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (~super.field6984 != -2 && super.field6984 != 0) {
            super.field6984 = this.method78(16726277);
         }

         if (arg0) {
            field11103 = null;
         }

         ++field11102;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11107[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5464(int arg0) {
      try {
         if (arg0 < 81) {
            method5463((byte)63);
         }

         ++field11098;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11107[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5465(boolean arg0) {
      try {
         field11105 = null;
         field11103 = null;
         if (!arg0) {
            method5463((byte)122);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11107[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5466(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5467(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

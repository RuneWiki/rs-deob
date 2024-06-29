import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class158 extends class454 {
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2035 = new String[]{method1333(method1332("\"I\u000fUL")), method1333(method1332("\"I\u000fQL")), method1333(method1332("\"I\u000fWL")), method1333(method1332("\"I\u000fVL")), method1333(method1332("\"I\u000fPL")), method1333(method1332("\"I\u000fSL")), method1333(method1332("\"I\u000fRL"))};
   @OriginalMember(
      owner = "client!mh",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field2027 = new int[1000];
   @OriginalMember(
      owner = "client!mh",
      name = "n",
      descriptor = "I"
   )
   public static int field2026;
   @OriginalMember(
      owner = "client!mh",
      name = "q",
      descriptor = "I"
   )
   public static int field2028;
   @OriginalMember(
      owner = "client!mh",
      name = "l",
      descriptor = "I"
   )
   public static int field2029;
   @OriginalMember(
      owner = "client!mh",
      name = "o",
      descriptor = "I"
   )
   public static int field2030;
   @OriginalMember(
      owner = "client!mh",
      name = "p",
      descriptor = "I"
   )
   public static int field2031;
   @OriginalMember(
      owner = "client!mh",
      name = "m",
      descriptor = "I"
   )
   public static int field2033;
   @OriginalMember(
      owner = "client!mh",
      name = "i",
      descriptor = "I"
   )
   public static int field2034;
   @OriginalMember(
      owner = "client!mh",
      name = "j",
      descriptor = "Lha;"
   )
   public static class479 field2032;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (~super.field6263 > -1 || super.field6263 > 4) {
            super.field6263 = this.method23(1);
         }

         ++field2026;
         if (!arg0) {
            field2030 = 122;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2035[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field2028;
         if (arg0 != 1) {
            method1329(79, (byte)-23, 2);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2035[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method24(98, false);
         }

         ++field2034;
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2035[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method1329(int arg0, byte arg1, int arg2) {
      try {
         ++field2029;
         class487 var3 = class2.method12((long)arg2 | (long)arg0 << 32, 19, (byte)43);
         int var4 = 107 % ((-32 - arg1) / 63);
         var3.method3696(-11118);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2035[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1330(byte arg0) {
      try {
         field2027 = null;
         if (arg0 != 90) {
            method1330((byte)-34);
         }

         field2032 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2035[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1331(int arg0) {
      try {
         ++field2031;
         if (arg0 != -18033) {
            this.method28(false);
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2035[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field2033;
         if (arg0 > -46) {
            this.method20((byte)115, -18);
         }

         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2035[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class158(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mh",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class158(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1332(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1333(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class class174 {
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2252 = new String[]{method1494(method1493("xAI4")), method1494(method1493("m\u001a\u000bv9")), method1494(method1493("aRDv\u0002>")), method1494(method1493("aRDv\u0003>")), method1494(method1493("aRDv\f>"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "Lkb;"
   )
   public static class500 field2247 = new class500(method1494(method1493("qUH=w")), method1494(method1493("QUH=d%")), 2);
   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2248;
   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2249;
   @OriginalMember(
      owner = "client!wfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2250;
   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "I"
   )
   public static int field2251;

   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "(B)J"
   )
   public abstract long method237(byte arg0);

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(Lww;I)V"
   )
   public static final void method1490(class339 arg0, int arg1) {
      try {
         class475.field6616 = arg0;
         if (arg1 < 25) {
            field2251 = 83;
         }

         ++field2248;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2252[2] + (arg0 != null ? field2252[1] : field2252[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method236(byte arg0);

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(JI)I"
   )
   public abstract int method235(long arg0, int arg1);

   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "(JI)I"
   )
   public final int method1491(long arg0, int arg1) {
      try {
         if (arg1 > -116) {
            this.method235(71L, -55);
         }

         ++field2250;
         long var4 = this.method238((byte)-99);
         if (~var4 < -1L) {
            class340.method2717(var4, (byte)-119);
         }

         return this.method235(arg0, 2);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2252[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "(B)J"
   )
   public abstract long method238(byte arg0);

   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1492(byte arg0) {
      try {
         field2247 = null;
         int var1 = 108 % ((3 - arg0) / 40);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2252[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1493(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1494(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

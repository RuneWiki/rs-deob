import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class559 extends class207 {
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8371 = new String[]{method4146(method4145("Bmb\u0007q")), method4146(method4145("M3bl$")), method4146(method4145("Xh .")), method4146(method4145("Bmb\u0003q")), method4146(method4145("Bmb\u0006q")), method4146(method4145("Bmb\u0000q")), method4146(method4145("Bmb\u0001q"))};
   @OriginalMember(
      owner = "client!tp",
      name = "w",
      descriptor = "B"
   )
   private byte field8363;
   @OriginalMember(
      owner = "client!tp",
      name = "r",
      descriptor = "B"
   )
   private byte field8366;
   @OriginalMember(
      owner = "client!tp",
      name = "s",
      descriptor = "B"
   )
   private byte field8367;
   @OriginalMember(
      owner = "client!tp",
      name = "u",
      descriptor = "B"
   )
   private byte field8368;
   @OriginalMember(
      owner = "client!tp",
      name = "o",
      descriptor = "I"
   )
   public static int field8361;
   @OriginalMember(
      owner = "client!tp",
      name = "v",
      descriptor = "I"
   )
   public static int field8362;
   @OriginalMember(
      owner = "client!tp",
      name = "n",
      descriptor = "I"
   )
   public static int field8365;
   @OriginalMember(
      owner = "client!tp",
      name = "q",
      descriptor = "I"
   )
   public static int field8369;
   @OriginalMember(
      owner = "client!tp",
      name = "t",
      descriptor = "I"
   )
   public static int field8370;
   @OriginalMember(
      owner = "client!tp",
      name = "p",
      descriptor = "Z"
   )
   private boolean field8364;

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(II)Z",
      line = 3
   )
   public static final boolean method4142(int arg0, int arg1) {
      try {
         ++field8369;
         if (arg0 != 7) {
            method4142(34, 32);
         }

         return arg1 != 1 && arg1 != 7;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8371[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 17
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.field3149 = this.field8364;
         arg0.field3124 = this.field8366;
         ++field8370;
         arg0.field3120 = this.field8367;
         arg0.field3132 = this.field8363;
         if (!arg1) {
            this.field8368 = 11;
         }

         arg0.field3126 = this.field8368;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8371[5] + (arg0 != null ? field8371[1] : field8371[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 38
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         ++field8361;
         this.field8364 = arg0.method1104(255) == 1;
         this.field8368 = arg0.method1047((byte)7);
         this.field8363 = arg0.method1047((byte)-125);
         this.field8367 = arg0.method1047((byte)68);
         if (!arg1) {
            this.field8363 = 76;
         }

         this.field8366 = arg0.method1047((byte)-122);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8371[3] + (arg0 != null ? field8371[1] : field8371[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(B)V",
      line = 53
   )
   public static final void method4143(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(I)V",
      line = 97
   )
   public static final void method4144(int arg0) {
      try {
         ++field8365;
         class330.method2507(0);
         class446.field6785 = false;
         if (arg0 > 34) {
            ;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8371[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

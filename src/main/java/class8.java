import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 implements class765 {
   @OriginalMember(
      owner = "client!to",
      name = "e",
      descriptor = "Lrs;"
   )
   private class677 field82;
   @OriginalMember(
      owner = "client!to",
      name = "g",
      descriptor = "Lhw;"
   )
   private class141 field84;
   @OriginalMember(
      owner = "client!to",
      name = "d",
      descriptor = "Lhw;"
   )
   private class141 field79;
   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field85 = new String[]{method63(method62("\u000eS\u0003'{\u0014UY%:")), method63(method62("\u0014IAw")), method63(method62("\u0001\u0012\u00035o")), method63(method62("\u000eS\u0003Y:")), method63(method62("\u000eS\u0003R:")), method63(method62("\u000eS\u0003\\:")), method63(method62("\u000eS\u0003Z:"))};
   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field83 = new int[4];
   @OriginalMember(
      owner = "client!to",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field77 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!to",
      name = "f",
      descriptor = "I"
   )
   public static int field76;
   @OriginalMember(
      owner = "client!to",
      name = "i",
      descriptor = "I"
   )
   public static int field78;
   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "I"
   )
   public static int field81;
   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "Lda;"
   )
   private class66 field80;

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         if (arg0) {
            int var3 = this.field82.field9941.method4952(this.field82.field9928, class140.field2281, true) - -this.field82.field9942;
            int var4 = this.field82.field9937.method1060(this.field82.field9940, -71, class664.field9661) + this.field82.field9924;
            this.field80.method717((int[])null, var3, 0, this.field82.field9940, 0, (class476[])null, this.field82.field9931, this.field82.field9928, this.field82.field9933, var4, this.field82.field9925, this.field82.field9936, (class510)null, this.field82.field9939, this.field82.field9938, 255);
         }

         ++field81;
         if (arg1 != 9124) {
            method60((byte)55);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field85[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method59(byte arg0) {
      try {
         int var2 = 58 % ((62 - arg0) / 51);
         ++field76;
         boolean var3 = true;
         if (!this.field79.method1335((byte)115, this.field82.field9927)) {
            var3 = false;
         }

         if (!this.field84.method1335((byte)115, this.field82.field9927)) {
            var3 = false;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field85[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method60(byte arg0) {
      try {
         field83 = null;
         if (arg0 != -36) {
            field77 = null;
         }

         field77 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field85[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method61(int arg0) {
      try {
         ++field78;
         class445 var2 = class85.method843(this.field84, this.field82.field9927, (byte)-98);
         if (arg0 == -15367) {
            this.field80 = class444.field6473.method414(var2, class94.method907(this.field79, this.field82.field9927), true);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field85[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lrs;)V"
   )
   public class8(class141 arg0, class141 arg1, class677 arg2) {
      try {
         this.field82 = arg2;
         this.field84 = arg1;
         this.field79 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field85[0] + (arg0 != null ? field85[2] : field85[1]) + ',' + (arg1 != null ? field85[2] : field85[1]) + ',' + (arg2 != null ? field85[2] : field85[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method62(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method63(char[] arg0) {
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
            var10005 = 60;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class536 extends class294 {
   @OriginalMember(
      owner = "client!sr",
      name = "o",
      descriptor = "J"
   )
   public long field8115;
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8117 = new String[]{method4118(method4117("\u0010{\u0010]M\r`J_\f")), method4118(method4117("\u0010{\u0010#\f")), method4118(method4117("\u0010{\u0010 \f"))};
   @OriginalMember(
      owner = "client!sr",
      name = "m",
      descriptor = "I"
   )
   public static int field8114 = -2;
   @OriginalMember(
      owner = "client!sr",
      name = "p",
      descriptor = "I"
   )
   public static int field8113;
   @OriginalMember(
      owner = "client!sr",
      name = "n",
      descriptor = "I"
   )
   public static int field8116;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method4115(int arg0, int arg1, int arg2) {
      try {
         if (arg2 >= -44) {
            return false;
         } else {
            ++field8116;
            return (33 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8117[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "<init>",
      descriptor = "()V",
      line = 20
   )
   public class536() {
   }

   @OriginalMember(
      owner = "client!sr",
      name = "<init>",
      descriptor = "(J)V",
      line = 22
   )
   public class536(long arg0) {
      try {
         this.field8115 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8117[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public static final void method4116(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4118(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

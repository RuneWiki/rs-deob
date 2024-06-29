import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class41 {
   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "B"
   )
   private byte field638;
   @OriginalMember(
      owner = "client!nt",
      name = "j",
      descriptor = "I"
   )
   public int field633;
   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "I"
   )
   public int field632;
   @OriginalMember(
      owner = "client!nt",
      name = "g",
      descriptor = "I"
   )
   public int field629;
   @OriginalMember(
      owner = "client!nt",
      name = "k",
      descriptor = "I"
   )
   public int field637;
   @OriginalMember(
      owner = "client!nt",
      name = "f",
      descriptor = "I"
   )
   public int field631;
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field640 = new String[]{method484(method483("\u001f+rP\f")), method484(method483("\nqrB\u0018\nl(@Y")), method484(method483("\np0\u0012")), method484(method483("\nqr?Y")), method484(method483("Xf3\u0012L\u0002c:\u0018\u0017\u0002;")), method484(method483("D-")), method484(method483("D(b^M\u0007j0C\u0017\u0002c:\u0018\u0017Z")), method484(method483("Xf3\u0012L\u0007f?\u001d\u0012\u0007;")), method484(method483("\nqr<Y")), method484(method483("\nqr=Y"))};
   @OriginalMember(
      owner = "client!nt",
      name = "h",
      descriptor = "J"
   )
   public static long field635 = 1L;
   @OriginalMember(
      owner = "client!nt",
      name = "i",
      descriptor = "I"
   )
   public static int field634 = -1;
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "I"
   )
   public static int field630;
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "I"
   )
   public static int field636;
   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "I"
   )
   public static int field639;

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method480(byte arg0) {
      try {
         ++field636;
         if (arg0 <= 108) {
            return 118;
         } else {
            return (this.field638 & 8) != 8 ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field640[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(Lkaa;BZ)V"
   )
   public static final void method481(class158 param0, byte param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method482(int arg0) {
      try {
         ++field639;
         if (arg0 != 7) {
            this.field638 = -80;
         }

         return 7 & this.field638;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field640[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "()V"
   )
   public class41() {
   }

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class41(class65 arg0) {
      try {
         this.field638 = arg0.method638(true);
         this.field633 = arg0.method685(-2);
         this.field632 = arg0.method701(255);
         this.field629 = arg0.method701(255);
         this.field637 = arg0.method701(255);
         this.field631 = arg0.method701(255);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field640[1] + (arg0 != null ? field640[0] : field640[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method483(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method484(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

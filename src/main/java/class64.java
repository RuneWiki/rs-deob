import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class64 extends class297 {
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "I"
   )
   private int field851;
   @OriginalMember(
      owner = "client!afa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field853 = new String[]{method495(method494("OHr-N\u0006")), method495(method494("OHr-6G@zw4\u0006")), method495(method494("OHr-H\u0006")), method495(method494("OHr-K\u0006")), method495(method494("OHr-I\u0006"))};
   @OriginalMember(
      owner = "client!afa",
      name = "B",
      descriptor = "I"
   )
   public static int field850 = 0;
   @OriginalMember(
      owner = "client!afa",
      name = "v",
      descriptor = "I"
   )
   public static int field846;
   @OriginalMember(
      owner = "client!afa",
      name = "x",
      descriptor = "I"
   )
   public static int field847;
   @OriginalMember(
      owner = "client!afa",
      name = "u",
      descriptor = "I"
   )
   public static int field848;
   @OriginalMember(
      owner = "client!afa",
      name = "A",
      descriptor = "I"
   )
   public static int field852;
   @OriginalMember(
      owner = "client!afa",
      name = "w",
      descriptor = "[Ldt;"
   )
   public class215[] field845;
   @OriginalMember(
      owner = "client!afa",
      name = "y",
      descriptor = "[[B"
   )
   private byte[][] field849;

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public final boolean method490(boolean arg0, int arg1) {
      try {
         ++field846;
         return !arg0 ? true : this.field845[arg1].field3271;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field853[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method491(byte arg0, int arg1) {
      try {
         if (arg0 != -72) {
            this.method493(116, (byte)124);
         }

         ++field852;
         return this.field845[arg1].field3262;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field853[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method492(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method493(int arg0, byte arg1) {
      try {
         if (arg1 != 61) {
            return false;
         } else {
            ++field847;
            return this.field845[arg0].field3257;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field853[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class64(int arg0) {
      try {
         this.field851 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field853[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method494(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method495(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

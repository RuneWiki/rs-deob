import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class174 {
   @OriginalMember(
      owner = "client!uh",
      name = "e",
      descriptor = "Lhw;"
   )
   private class141 field2676;
   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "Lhw;"
   )
   private class141 field2677;
   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2682 = new String[]{method1554(method1553("\u0002\u0013OBh\u0019\u0012\u0015@)")), method1554(method1553("\fUOP|")), method1554(method1553("\u0019\u000e\r\u0012")), method1554(method1553("\u0002\u0013O?)")), method1554(method1553("\u0002\u0013O<)")), method1554(method1553("\u0002\u0013O=)"))};
   @OriginalMember(
      owner = "client!uh",
      name = "c",
      descriptor = "I"
   )
   public static int field2681 = 0;
   @OriginalMember(
      owner = "client!uh",
      name = "d",
      descriptor = "I"
   )
   public static int field2678;
   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "I"
   )
   public static int field2679;
   @OriginalMember(
      owner = "client!uh",
      name = "f",
      descriptor = "Lqs;"
   )
   private class627 field2680;

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method1550(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2682[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(B)Lqs;"
   )
   private final class627 method1551(byte arg0) {
      try {
         ++field2678;
         if (arg0 <= 119) {
            this.method1552(false, (class644)null);
         }

         if (this.field2680 == null) {
            this.field2680 = new class627();
         }

         return this.field2680;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2682[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(ZLtl;)Lsia;"
   )
   public final class765 method1552(boolean arg0, class644 arg1) {
      try {
         ++field2679;
         if (arg1 == null) {
            return null;
         } else if (!arg0) {
            return null;
         } else {
            class485 var3 = arg1.method672((byte)83);
            if (class443.field6458 == var3) {
               return new class527((class264)arg1);
            } else if (class289.field4044 == var3) {
               return new class616(this.method1551((byte)120), (class569)arg1);
            } else if (class431.field6249 == var3) {
               return new class333(this.field2677, (class790)arg1);
            } else if (class601.field8675 == var3) {
               return new class776(this.field2677, (class62)arg1);
            } else if (class604.field8697 == var3) {
               return new class578(this.field2677, this.field2676, (class250)arg1);
            } else if (class722.field10450 == var3) {
               return new class306(this.field2677, this.field2676, (class71)arg1);
            } else if (class471.field6841 == var3) {
               return new class532(this.field2677, this.field2676, (class411)arg1);
            } else if (class318.field4600 == var3) {
               return new class8(this.field2677, this.field2676, (class677)arg1);
            } else if (class313.field4510 == var3) {
               return new class198(this.field2677, (class130)arg1);
            } else {
               return class477.field6955 == var3 ? new class424(this.field2677, this.field2676, (class151)arg1) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2682[3] + arg0 + ',' + (arg1 != null ? field2682[1] : field2682[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "<init>",
      descriptor = "(Lhw;Lhw;)V"
   )
   public class174(class141 arg0, class141 arg1) {
      try {
         this.field2676 = arg1;
         this.field2677 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2682[0] + (arg0 != null ? field2682[1] : field2682[2]) + ',' + (arg1 != null ? field2682[1] : field2682[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1553(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1554(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class697 {
   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "Loi;"
   )
   private class80 field10221 = new class80(64);
   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "Lkf;"
   )
   private class266 field10222;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10223 = new String[]{method5075(method5074("\u0019\u0002\u0005@\u0006V")), method5075(method5074("\u0019\u0002\u0005@\u0005V")), method5075(method5074("\u0010\u0015\b\u0002")), method5075(method5074("\u0005NJ@:")), method5075(method5074("\u0019\u0002\u0005@{\u0017\u000e\r\u001ayV"))};
   @OriginalMember(
      owner = "client!gba",
      name = "c",
      descriptor = "I"
   )
   public static int field10218;
   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "I"
   )
   public static int field10219;
   @OriginalMember(
      owner = "client!gba",
      name = "e",
      descriptor = "I"
   )
   public static int field10220;

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(II)Led;",
      line = 3
   )
   public final class735 method5072(int arg0, int arg1) {
      try {
         ++field10220;
         class80 var3 = this.field10221;
         class735 var4;
         synchronized(this.field10221) {
            var4 = (class735)this.field10221.method725(0, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field10222;
            byte[] var6;
            synchronized(this.field10222) {
               var6 = this.field10222.method2037(false, arg1, arg0);
            }

            class735 var7 = new class735();
            if (var6 != null) {
               var7.method5343((byte)81, new class147(var6));
            }

            class80 var8 = this.field10221;
            synchronized(this.field10221) {
               this.field10221.method723(0, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10223[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IIII)I",
      line = 41
   )
   public static final int method5073(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10219;
         int var6 = arg2 & 3;
         if (var6 == 0) {
            return arg0;
         } else {
            if (arg3 > -55) {
               method5073(-66, 82, -14, 6);
            }

            if (var6 == 1) {
               return arg1;
            } else {
               return ~var6 == -3 ? -arg0 + 7 : -arg1 + 7;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10223[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 66
   )
   public class697(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field10222 = arg2;
         this.field10222.method2060(2, 5);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10223[4] + (arg0 != null ? field10223[3] : field10223[2]) + ',' + arg1 + ',' + (arg2 != null ? field10223[3] : field10223[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5074(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5075(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

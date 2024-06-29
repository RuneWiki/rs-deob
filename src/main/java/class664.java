import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class664 {
   @OriginalMember(
      owner = "client!av",
      name = "f",
      descriptor = "I"
   )
   private int field9660 = -1;
   @OriginalMember(
      owner = "client!av",
      name = "c",
      descriptor = "Liw;"
   )
   private class332 field9658 = new class332();
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9662 = new String[]{method4860(method4859("\u0001\u0004\u0002t")), method4860(method4859("O\u0015\u000bt4\u000e_\u0001o.\n\u0003T")), method4860(method4859("O\u0004\u001e|!\u001b\u0014 m-U")), method4860(method4859("\u000e\u0007@Yh")), method4860(method4859(",\u001d\u000fv\u0013\n\u0005\u001aq.\b\u0002*},\u001b\u0010@y0\u001f\u001d\u0017L/,\u001d\u000fv\u0013\n\u0005\u001aq.\b\u0002F1zO2\u001c}$\n\u001f\u001aq!\u0003\u0002N|/O\u001f\u0001l`\u0002\u0010\u001a{(NQ=}4\u001b\u0018\u0000\u007f3A\u001e\u0019v%\u001dK")), method4860(method4859("\u0014_@6=")), method4860(method4859("\u000e\u0007@$)\u0001\u0018\u001a&h")), method4860(method4859("\u001bK")), method4860(method4859(":\u001f\u001c}#\u0000\u0016\u0000q3\n\u0015N[,\u000e\u001f=}4\u001b\u0018\u0000\u007f3+\u0014\u0002l!O\u0005\u0017h%O\u0018\u00008$\n\u0012\u0001|%GX")), method4860(method4859("\u000e\u0007@[h")), method4860(method4859("\u000e\u0007@Zh"))};
   @OriginalMember(
      owner = "client!av",
      name = "b",
      descriptor = "Lwp;"
   )
   public static class189 field9657 = new class189(true);
   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "I"
   )
   public static int field9661 = 503;
   @OriginalMember(
      owner = "client!av",
      name = "g",
      descriptor = "I"
   )
   public static int field9655;
   @OriginalMember(
      owner = "client!av",
      name = "e",
      descriptor = "I"
   )
   public static int field9656;
   @OriginalMember(
      owner = "client!av",
      name = "d",
      descriptor = "J"
   )
   private long field9659;

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ILwga;)V"
   )
   public final void method4856(int arg0, class778 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field9655;
         if (~this.field9659 == ~arg1.field11396 && this.field9660 == arg1.field11385) {
            class588 var4 = (class588)this.field9658.method2579(-801);
            if (var3) {
               var4.method135(arg1, -122);
               var4 = (class588)this.field9658.method2583(1);
            }

            while(true) {
               if (var4 == null) {
                  if (!var3) {
                     if (arg0 != 0) {
                        this.method4856(-18, (class778)null);
                     }

                     ++arg1.field11385;
                     return;
                  }
               } else {
                  var4.method135(arg1, -122);
               }

               var4 = (class588)this.field9658.method2583(1);
            }
         } else {
            throw new RuntimeException(field9662[4] + class166.method1512(true, arg1.field11396) + field9662[2] + arg1.field11385 + field9662[1] + class166.method1512(true, this.field9659) + field9662[2] + this.field9660);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9662[3] + arg0 + ',' + (arg1 != null ? field9662[5] : field9662[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4857(int arg0) {
      try {
         field9657 = null;
         if (arg0 != -10913) {
            method4857(-20);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9662[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   private final void method4858(class473 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Luda;)V"
   )
   public class664(class473 arg0) {
      try {
         this.method4858(arg0, -94);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9662[6] + (arg0 != null ? field9662[5] : field9662[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4859(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4860(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

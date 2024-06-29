import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class124 implements Runnable {
   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1617 = new String[]{method1002(method1001("#\t7M\u0011\"\u0010!\u0005\u0005m\n7\u0007")), method1002(method1001("n\n|xJ")), method1002(method1001("d\u0013&JX#H")), method1002(method1001("n\n|{J")), method1002(method1001("n\n|H\u0017bO"))};
   @OriginalMember(
      owner = "client!bm",
      name = "d",
      descriptor = "I"
   )
   public static int field1612 = 0;
   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "I"
   )
   public static int field1616 = 0;
   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "I"
   )
   public static int field1608;
   @OriginalMember(
      owner = "client!bm",
      name = "c",
      descriptor = "I"
   )
   public static int field1611;
   @OriginalMember(
      owner = "client!bm",
      name = "h",
      descriptor = "I"
   )
   public static int field1615;
   @OriginalMember(
      owner = "client!bm",
      name = "g",
      descriptor = "Lvca;"
   )
   private class296 field1614;
   @OriginalMember(
      owner = "client!bm",
      name = "i",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field1613;
   @OriginalMember(
      owner = "client!bm",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field1610;
   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "[Lsha;"
   )
   private class760[] field1609;

   @OriginalMember(
      owner = "client!bm",
      name = "run",
      descriptor = "()V",
      line = 3
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(II)Lsha;",
      line = 46
   )
   public final class760 method999(int arg0, int arg1) {
      try {
         if (arg1 != -1) {
            this.method1000((byte)24);
         }

         ++field1611;
         return this.field1609 != null && ~arg0 <= -1 && ~this.field1609.length < ~arg0 ? this.field1609[arg0] : null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1617[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(B)Z",
      line = 76
   )
   public final boolean method1000(byte arg0) {
      try {
         ++field1608;
         if (this.field1610) {
            return true;
         } else {
            if (this.field1614 == null) {
               try {
                  int var2 = class435.field6230 == class290.field4016 ? 80 : class393.field5689.field6156 + 7000;
                  this.field1614 = class316.field4304.method4509((byte)87, new URL(field1617[2] + class393.field5689.field6161 + ":" + var2 + field1617[0] + class134.field1715.field10710));
               } catch (MalformedURLException var5) {
                  return true;
               }
            }

            if (this.field1614 != null && ~this.field1614.field4078 != -3) {
               if (~this.field1614.field4078 != -2) {
                  return false;
               } else {
                  if (this.field1613 == null) {
                     this.field1613 = new Thread(this);
                     this.field1613.start();
                  }

                  int var3 = 58 % ((-3 - arg0) / 56);
                  return this.field1610;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1617[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1001(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1002(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

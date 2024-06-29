import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class529 implements Runnable {
   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8032 = new String[]{method4067(method4066("!\"i*e2% ")), method4067(method4066("/?|t-hd")), method4067(method4066("!\"i*Vo")), method4067(method4066("h%msdi<{;p&&m9")), method4067(method4066("!\"i*To")), method4067(method4066("!\"i*Uo"))};
   @OriginalMember(
      owner = "client!fia",
      name = "e",
      descriptor = "[Lln;"
   )
   public static class433[] field8026 = new class433[0];
   @OriginalMember(
      owner = "client!fia",
      name = "d",
      descriptor = "I"
   )
   public static int field8025;
   @OriginalMember(
      owner = "client!fia",
      name = "f",
      descriptor = "I"
   )
   public static int field8028;
   @OriginalMember(
      owner = "client!fia",
      name = "c",
      descriptor = "I"
   )
   public static int field8030;
   @OriginalMember(
      owner = "client!fia",
      name = "g",
      descriptor = "Lbja;"
   )
   private class275 field8031;
   @OriginalMember(
      owner = "client!fia",
      name = "h",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field8027;
   @OriginalMember(
      owner = "client!fia",
      name = "i",
      descriptor = "Z"
   )
   private volatile boolean field8029;
   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "[Ljq;"
   )
   public static class672[] field8024;
   @OriginalMember(
      owner = "client!fia",
      name = "b",
      descriptor = "[Ljba;"
   )
   private class79[] field8023;

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4063(boolean arg0) {
      try {
         field8026 = null;
         field8024 = null;
         if (arg0) {
            field8024 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8032[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4064(int arg0) {
      try {
         ++field8025;
         if (this.field8029) {
            return true;
         } else {
            if (this.field8031 == null) {
               try {
                  int var2 = class657.field9823 != class129.field1852 ? class546.field8194.field8150 + 7000 : 80;
                  this.field8031 = class498.field7578.method2441(new URL(field8032[1] + class546.field8194.field8152 + ":" + var2 + field8032[3] + class410.field6382.field4824), 16980);
               } catch (MalformedURLException var4) {
                  return true;
               }
            }

            if (arg0 > -51) {
               field8026 = null;
            }

            if (this.field8031 != null && ~this.field8031.field4398 != -3) {
               if (~this.field8031.field4398 != -2) {
                  return false;
               } else {
                  if (this.field8027 == null) {
                     this.field8027 = new Thread(this);
                     this.field8027.start();
                  }

                  return this.field8029;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8032[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(II)Ljba;"
   )
   public final class79 method4065(int arg0, int arg1) {
      try {
         ++field8028;
         if (arg0 != -1) {
            this.run();
         }

         return this.field8023 != null && ~arg1 <= -1 && ~arg1 > ~this.field8023.length ? this.field8023[arg1] : null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8032[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4066(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4067(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

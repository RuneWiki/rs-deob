import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pka")
public class class143 implements Runnable {
   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "[Lgj;"
   )
   public volatile class761[] field2031 = new class761[2];
   @OriginalMember(
      owner = "client!pka",
      name = "c",
      descriptor = "Z"
   )
   public volatile boolean field2028 = false;
   @OriginalMember(
      owner = "client!pka",
      name = "d",
      descriptor = "Z"
   )
   public volatile boolean field2029 = false;
   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2035 = new String[]{method1302(method1301("S\u001f\u0001N\\\u000b")), method1302(method1301("S\u001f\u0001N_\u000b")), method1302(method1301("S\u001f\u0001NlV\u001aH"))};
   @OriginalMember(
      owner = "client!pka",
      name = "h",
      descriptor = "I"
   )
   public static int field2033 = -1;
   @OriginalMember(
      owner = "client!pka",
      name = "b",
      descriptor = "I"
   )
   public static int field2027;
   @OriginalMember(
      owner = "client!pka",
      name = "g",
      descriptor = "I"
   )
   public static int field2032;
   @OriginalMember(
      owner = "client!pka",
      name = "e",
      descriptor = "Lsu;"
   )
   public class289 field2030;
   @OriginalMember(
      owner = "client!pka",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field2034;

   @OriginalMember(
      owner = "client!pka",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method1299(int arg0) {
      try {
         class687.field10213.method299(arg0 + -18, 1, class687.field10213.field546);
         ++field2032;
         class687.field10213.method299(-17, 1, class687.field10213.field536);
         class687.field10213.method299(-17, 2, class687.field10213.field516);
         class687.field10213.method299(-17, 2, class687.field10213.field501);
         class687.field10213.method299(-17, 1, class687.field10213.field534);
         class687.field10213.method299(arg0 + -18, 1, class687.field10213.field529);
         class687.field10213.method299(-17, arg0, class687.field10213.field497);
         class687.field10213.method299(-17, 1, class687.field10213.field519);
         class687.field10213.method299(-17, 1, class687.field10213.field528);
         class687.field10213.method299(-17, 1, class687.field10213.field547);
         class687.field10213.method299(arg0 + -18, 1, class687.field10213.field498);
         class687.field10213.method299(-17, 1, class687.field10213.field513);
         class687.field10213.method299(-17, 0, class687.field10213.field525);
         class687.field10213.method299(-17, 1, class687.field10213.field495);
         class687.field10213.method299(arg0 ^ -18, 0, class687.field10213.field496);
         class687.field10213.method299(-17, 0, class687.field10213.field533);
         class687.field10213.method299(-17, 1, class687.field10213.field503);
         class687.field10213.method299(-17, 0, class687.field10213.field527);
         class687.field10213.method299(arg0 + -18, 0, class687.field10213.field535);
         class687.field10213.method299(-17, 1, class687.field10213.field515);
         class176.method1609(arg0 ^ -119);
         class687.field10213.method299(-17, 1, class687.field10213.field530);
         class687.field10213.method299(-17, 3, class687.field10213.field531);
         class698.method5133(42);
         class410.method3287(false);
         class741.field11026 = true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2035[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "run",
      descriptor = "()V",
      line = 40
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         this.field2029 = true;
         ++field2027;

         try {
            if (var1 || !this.field2028) {
               do {
                  int var2 = 0;
                  if (var1 || var2 < 2) {
                     do {
                        class761 var3 = this.field2031[var2];
                        if (var3 != null) {
                           var3.method5578(1);
                        }

                        ++var2;
                     } while(var2 < 2);
                  }

                  class697.method5128(10L, 87);
                  class180.method1635((byte)-120, (Object)null, this.field2030);
               } while(!this.field2028);
            }
         } catch (Exception var12) {
            class281.method2349(1, (String)null, var12);
         } finally {
            Object var8 = null;
            this.field2029 = false;
         }

      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field2035[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(I)V",
      line = 87
   )
   public static void method1300(int arg0) {
      try {
         if (arg0 != 6395) {
            field2034 = null;
         }

         field2034 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2035[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1301(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1302(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

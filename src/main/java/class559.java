import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class559 {
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8196 = new String[]{method4217(method4216("X\u000bY#\u001f")), method4217(method4216("MP\u001ba")), method4217(method4216("LD\u0016#!\u000b")), method4217(method4216("LD\u0016# \u000b")), method4217(method4216("LD\u0016#'\u000b")), method4217(method4216("LD\u0016##\u000b")), method4217(method4216("\rO\u0016{\u0003\u0019")), method4217(method4216("\u0003YW")), method4217(method4216("_\u0005"))};
   @OriginalMember(
      owner = "client!oaa",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field8186 = new int[1];
   @OriginalMember(
      owner = "client!oaa",
      name = "e",
      descriptor = "Lrca;"
   )
   public static class37 field8187 = new class37();
   @OriginalMember(
      owner = "client!oaa",
      name = "i",
      descriptor = "I"
   )
   public static int field8183;
   @OriginalMember(
      owner = "client!oaa",
      name = "m",
      descriptor = "I"
   )
   public static int field8188;
   @OriginalMember(
      owner = "client!oaa",
      name = "d",
      descriptor = "I"
   )
   public static int field8189;
   @OriginalMember(
      owner = "client!oaa",
      name = "f",
      descriptor = "I"
   )
   public int field8190;
   @OriginalMember(
      owner = "client!oaa",
      name = "l",
      descriptor = "I"
   )
   public static int field8191;
   @OriginalMember(
      owner = "client!oaa",
      name = "c",
      descriptor = "I"
   )
   private int field8192;
   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "I"
   )
   public static int field8193;
   @OriginalMember(
      owner = "client!oaa",
      name = "j",
      descriptor = "I"
   )
   public int field8195;
   @OriginalMember(
      owner = "client!oaa",
      name = "k",
      descriptor = "Lsd;"
   )
   public static class296 field8194;
   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "Lww;"
   )
   public static class339 field8185;
   @OriginalMember(
      owner = "client!oaa",
      name = "h",
      descriptor = "Lgha;"
   )
   public class690 field8184;

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(B)Lu;"
   )
   public final synchronized class65 method4211(byte arg0) {
      try {
         ++field8191;
         class65 var2 = (class65)this.field8184.field10148.method3192((long)this.field8192, (byte)-127);
         if (var2 != null) {
            return var2;
         } else {
            class65 var3 = class65.method589(this.field8184.field10140, this.field8192, 0);
            if (arg0 != -3) {
               field8194 = null;
            }

            if (var3 != null) {
               this.field8184.field10148.method3190(var3, (long)this.field8192, 8);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8196[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;"
   )
   public static final String method4212(byte arg0, Throwable arg1) throws IOException {
      boolean var2;
      String var4;
      label45: {
         var2 = client.field1481;
         ++field8188;
         if (arg1 instanceof class355) {
            class355 var3 = (class355)arg1;
            var4 = var3.field4958 + field8196[7];
            arg1 = var3.field4953;
            if (!var2) {
               break label45;
            }
         }

         var4 = "";
      }

      StringWriter var5 = new StringWriter();
      PrintWriter var6 = new PrintWriter(var5);
      arg1.printStackTrace(var6);
      var6.close();
      String var7 = var5.toString();
      if (arg0 <= 96) {
         field8187 = null;
      }

      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      String var9 = var8.readLine();

      while(true) {
         String var10 = var8.readLine();
         if (var10 != null) {
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            if (var2) {
               break;
            }

            String var13;
            label34: {
               if (var11 != -1) {
                  var13 = var10.substring(0, var11);
                  if (!var2) {
                     break label34;
                  }
               }

               var13 = var10;
            }

            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) - -1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var4 + var16;
            if (var11 != -1 && ~var12 != 0) {
               int var18 = var10.indexOf(field8196[6], var11);
               if (var18 >= 0) {
                  var17 = var17 + var10.substring(var18 - -5, var12);
               }
            }

            var4 = var17 + ' ';
            if (!var2) {
               continue;
            }
         }

         var4 = var4 + field8196[8] + var9;
         break;
      }

      return var4;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(Lgea;II)V"
   )
   private final void method4213(class66 arg0, int arg1, int arg2) {
      try {
         ++field8183;
         if (arg1 > -69) {
            this.method4213((class66)null, 56, -7);
         }

         if (arg2 == 1) {
            this.field8192 = arg0.method603(-2);
         } else if (~arg2 == -3) {
            this.field8190 = arg0.method640(255);
            this.field8195 = arg0.method640(255);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8196[2] + (arg0 != null ? field8196[0] : field8196[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4214(boolean arg0) {
      try {
         if (!arg0) {
            field8187 = null;
            field8194 = null;
            field8185 = null;
            field8186 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8196[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   public final void method4215(byte arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg1.method640(255);
            if (var4 != 0) {
               this.method4213(arg1, -91, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 < 15) {
               method4214(true);
            }

            ++field8189;
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8196[4] + arg0 + ',' + (arg1 != null ? field8196[0] : field8196[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4216(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4217(char[] arg0) {
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
            var10005 = 37;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

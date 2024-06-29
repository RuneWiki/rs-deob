import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class661 {
   @OriginalMember(
      owner = "client!sp",
      name = "h",
      descriptor = "[S"
   )
   public short[] field9572;
   @OriginalMember(
      owner = "client!sp",
      name = "i",
      descriptor = "[S"
   )
   public short[] field9581;
   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "J"
   )
   public long field9577;
   @OriginalMember(
      owner = "client!sp",
      name = "d",
      descriptor = "[I"
   )
   public int[] field9574;
   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9582 = new String[]{method4750(method4749("/.b")), method4750(method4749("sr")), method4750(method4749("!8#w~5")), method4750(method4749("|\"lE7")), method4750(method4749("|\"lC7")), method4750(method4749("|\"lB7")), method4750(method4749("a'.m")), method4750(method4749("t|l/b")), method4750(method4749("|\"l=va;6?7"))};
   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "[Llw;"
   )
   public static class687[] field9578 = new class687[2048];
   @OriginalMember(
      owner = "client!sp",
      name = "g",
      descriptor = "Ldw;"
   )
   public static class748 field9573 = new class748(64);
   @OriginalMember(
      owner = "client!sp",
      name = "f",
      descriptor = "I"
   )
   public static int field9575;
   @OriginalMember(
      owner = "client!sp",
      name = "k",
      descriptor = "I"
   )
   public static int field9576;
   @OriginalMember(
      owner = "client!sp",
      name = "e",
      descriptor = "I"
   )
   public static int field9579;
   @OriginalMember(
      owner = "client!sp",
      name = "j",
      descriptor = "I"
   )
   public static int field9580;
   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "[[S"
   )
   public static short[][] field9571;

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4745(int arg0) {
      try {
         field9578 = null;
         field9573 = null;
         field9571 = null;
         if (arg0 != -1) {
            field9578 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9582[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4746(int arg0, int arg1) {
      try {
         if (arg1 != 3764) {
            field9578 = null;
         }

         ++field9576;
         return arg0 >>> 10;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9582[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4747(int arg0) {
      try {
         if (arg0 == -2236) {
            ++field9575;
            class597.field8785.method1544(99);
            class723.field10766.method376(52);
            class158.field2008.method2393((byte)-100);
            class769.field11271.setBackground(Color.black);
            class109.field1331 = -1;
            class597.field8785 = class432.method3289((byte)-75, class769.field11271);
            class723.field10766 = class548.method4053(class769.field11271, true, true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9582[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;"
   )
   public static final String method4748(byte arg0, Throwable arg1) throws IOException {
      int var2;
      String var5;
      label41: {
         var2 = client.field4530;
         ++field9579;
         int var3 = 77 / ((64 - arg0) / 54);
         if (arg1 instanceof class236) {
            class236 var4 = (class236)arg1;
            var5 = var4.field2994 + field9582[0];
            arg1 = var4.field2993;
            if (var2 == 0) {
               break label41;
            }
         }

         var5 = "";
      }

      StringWriter var6 = new StringWriter();
      PrintWriter var7 = new PrintWriter(var6);
      arg1.printStackTrace(var7);
      var7.close();
      String var8 = var6.toString();
      BufferedReader var9 = new BufferedReader(new StringReader(var8));
      String var10 = var9.readLine();

      while(true) {
         String var11 = var9.readLine();
         if (var11 != null) {
            int var12 = var11.indexOf(40);
            int var13 = var11.indexOf(41, var12 + 1);
            if (var2 != 0) {
               break;
            }

            String var14;
            label30: {
               if (var12 != -1) {
                  var14 = var11.substring(0, var12);
                  if (var2 == 0) {
                     break label30;
                  }
               }

               var14 = var11;
            }

            String var15 = var14.trim();
            String var16 = var15.substring(1 + var15.lastIndexOf(32));
            String var17 = var16.substring(var16.lastIndexOf(9) + 1);
            String var18 = var5 + var17;
            if (~var12 != 0 && ~var13 != 0) {
               int var19 = var11.indexOf(field9582[2], var12);
               if (~var19 <= -1) {
                  var18 = var18 + var11.substring(var19 + 5, var13);
               }
            }

            var5 = var18 + ' ';
            if (var2 == 0) {
               continue;
            }
         }

         var5 = var5 + field9582[1] + var10;
         break;
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class661(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field9572 = arg3;
         this.field9581 = arg2;
         this.field9577 = arg0;
         this.field9574 = arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9582[8] + arg0 + ',' + (arg1 != null ? field9582[7] : field9582[6]) + ',' + (arg2 != null ? field9582[7] : field9582[6]) + ',' + (arg3 != null ? field9582[7] : field9582[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "<init>",
      descriptor = "()V"
   )
   protected class661() {
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4749(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4750(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

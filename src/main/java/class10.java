import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {
   @OriginalMember(
      owner = "client!hba",
      name = "o",
      descriptor = "Lll;"
   )
   private class387 field98 = new class387();
   @OriginalMember(
      owner = "client!hba",
      name = "k",
      descriptor = "I"
   )
   private int field104 = 0;
   @OriginalMember(
      owner = "client!hba",
      name = "s",
      descriptor = "Lwf;"
   )
   private class147 field103 = new class147(1350);
   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "Lbda;"
   )
   public class534 field105 = new class534(15000);
   @OriginalMember(
      owner = "client!hba",
      name = "B",
      descriptor = "I"
   )
   public int field110 = 0;
   @OriginalMember(
      owner = "client!hba",
      name = "v",
      descriptor = "Z"
   )
   public boolean field112 = true;
   @OriginalMember(
      owner = "client!hba",
      name = "f",
      descriptor = "I"
   )
   public int field107 = 0;
   @OriginalMember(
      owner = "client!hba",
      name = "g",
      descriptor = "Leg;"
   )
   public class118 field116 = null;
   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "Z"
   )
   public boolean field119 = false;
   @OriginalMember(
      owner = "client!hba",
      name = "n",
      descriptor = "I"
   )
   public int field114 = 0;
   @OriginalMember(
      owner = "client!hba",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field120 = new String[]{method57(method56("v\r-^26")), method57(method56("p\u001a \u001c")), method57(method56("eAb^\r")), method57(method56("v\r-^76")), method57(method56("v\r-^36")), method57(method56("v\r-^16")), method57(method56("v\r-^46")), method57(method56("v\r-^56")), method57(method56("v\r-^66"))};
   @OriginalMember(
      owner = "client!hba",
      name = "i",
      descriptor = "Ltn;"
   )
   public static class95 field93 = new class95();
   @OriginalMember(
      owner = "client!hba",
      name = "d",
      descriptor = "I"
   )
   public static int field100;
   @OriginalMember(
      owner = "client!hba",
      name = "h",
      descriptor = "I"
   )
   public static int field101;
   @OriginalMember(
      owner = "client!hba",
      name = "m",
      descriptor = "I"
   )
   private int field108;
   @OriginalMember(
      owner = "client!hba",
      name = "j",
      descriptor = "I"
   )
   public int field109;
   @OriginalMember(
      owner = "client!hba",
      name = "r",
      descriptor = "I"
   )
   public int field111;
   @OriginalMember(
      owner = "client!hba",
      name = "l",
      descriptor = "I"
   )
   public int field118;
   @OriginalMember(
      owner = "client!hba",
      name = "w",
      descriptor = "I"
   )
   public static int field92;
   @OriginalMember(
      owner = "client!hba",
      name = "t",
      descriptor = "I"
   )
   public static int field94;
   @OriginalMember(
      owner = "client!hba",
      name = "y",
      descriptor = "I"
   )
   public static int field95;
   @OriginalMember(
      owner = "client!hba",
      name = "p",
      descriptor = "I"
   )
   public static int field96;
   @OriginalMember(
      owner = "client!hba",
      name = "e",
      descriptor = "I"
   )
   public static int field99;
   @OriginalMember(
      owner = "client!hba",
      name = "q",
      descriptor = "Leg;"
   )
   public class118 field113;
   @OriginalMember(
      owner = "client!hba",
      name = "c",
      descriptor = "Leg;"
   )
   public class118 field115;
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "Leg;"
   )
   public class118 field117;
   @OriginalMember(
      owner = "client!hba",
      name = "u",
      descriptor = "Lvca;"
   )
   public class296 field97;
   @OriginalMember(
      owner = "client!hba",
      name = "x",
      descriptor = "Lne;"
   )
   public class338 field102;
   @OriginalMember(
      owner = "client!hba",
      name = "A",
      descriptor = "Lqi;"
   )
   public class594 field106;

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "([I[JIII)V",
      line = 5
   )
   public static final void method49(int[] param0, long[] param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(I)V",
      line = 62
   )
   public final void method50(int arg0) {
      try {
         int var2 = -79 % ((63 - arg0) / 61);
         ++field94;
         this.field98.method2934(0);
         this.field104 = 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field120[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(B)V",
      line = 76
   )
   public static void method51(byte arg0) {
      try {
         field93 = null;
         int var1 = -75 % ((-4 - arg0) / 43);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field120[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "(B)V",
      line = 86
   )
   public final void method52(byte arg0) throws IOException {
      boolean var2 = client.field4360;

      try {
         if (arg0 != 94) {
            method51((byte)-103);
         }

         int var10000;
         int var10001;
         label39: {
            if (this.field102 != null && this.field104 > 0) {
               this.field103.field1856 = 0;

               do {
                  class447 var3 = (class447)this.field98.method2933(2);
                  if (var3 == null) {
                     break;
                  }

                  var10000 = ~(this.field103.field1889.length + -this.field103.field1856);
                  var10001 = ~var3.field6352;
                  if (var2) {
                     break label39;
                  }

                  if (var10000 > var10001) {
                     break;
                  }

                  this.field103.method1193((byte)56, var3.field6359.field1889, 0, var3.field6352);
                  this.field104 -= var3.field6352;
                  var3.method3165(116);
                  var3.field6359.method1202((byte)3);
                  var3.method3281((byte)-61);
               } while(!var2);

               this.field102.method1381(-17613, 0, this.field103.field1889, this.field103.field1856);
               this.field108 += this.field103.field1856;
               this.field107 = 0;
            }

            var10000 = field99;
            var10001 = 1;
         }

         field99 = var10000 + var10001;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field120[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "d",
      descriptor = "(B)V",
      line = 123
   )
   public final void method53(byte arg0) {
      try {
         if (class96.field1234 % 50 == 0) {
            this.field118 = this.field108;
            this.field111 = this.field109;
            this.field108 = 0;
            this.field109 = 0;
         }

         if (arg0 != -29) {
            this.field117 = null;
         }

         ++field101;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field120[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "c",
      descriptor = "(B)V",
      line = 147
   )
   public final void method54(byte arg0) {
      try {
         if (this.field102 != null) {
            this.field102.method1377(false);
            this.field102 = null;
         }

         ++field100;
         if (arg0 < 66) {
            this.field116 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field120[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(ILij;)V",
      line = 169
   )
   public final void method55(int arg0, class447 arg1) {
      try {
         this.field98.method2930((byte)-77, arg1);
         if (arg0 != 13256) {
            this.field116 = null;
         }

         ++field95;
         arg1.field6352 = arg1.field6359.field1856;
         this.field104 += arg1.field6352;
         arg1.field6359.field1856 = 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field120[4] + arg0 + ',' + (arg1 != null ? field120[2] : field120[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method56(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method57(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

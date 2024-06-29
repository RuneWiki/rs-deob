import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class581 extends class264 {
   @OriginalMember(
      owner = "client!jw",
      name = "M",
      descriptor = "I"
   )
   private int field8547 = 4096;
   @OriginalMember(
      owner = "client!jw",
      name = "I",
      descriptor = "I"
   )
   private int field8549 = 0;
   @OriginalMember(
      owner = "client!jw",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8556 = new String[]{method4211(method4210("\u0004\b&p ")), method4211(method4210("\u0004\b&q ")), method4211(method4210("\u0004\b&v ")), method4211(method4210("\u0015Q&\u001cu")), method4211(method4210("\u0004\b&s ")), method4211(method4210("\u0000\nd^")), method4211(method4210("\u0004\b&t ")), method4211(method4210("\u0004\b&w ")), method4211(method4210("\u001a\u001dzWn\u001c\u001a{Z"))};
   @OriginalMember(
      owner = "client!jw",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8554 = new String[200];
   @OriginalMember(
      owner = "client!jw",
      name = "G",
      descriptor = "I"
   )
   public static int field8546;
   @OriginalMember(
      owner = "client!jw",
      name = "F",
      descriptor = "I"
   )
   public static int field8548;
   @OriginalMember(
      owner = "client!jw",
      name = "J",
      descriptor = "I"
   )
   public static int field8550;
   @OriginalMember(
      owner = "client!jw",
      name = "L",
      descriptor = "I"
   )
   public static int field8551;
   @OriginalMember(
      owner = "client!jw",
      name = "O",
      descriptor = "I"
   )
   public static int field8552;
   @OriginalMember(
      owner = "client!jw",
      name = "K",
      descriptor = "I"
   )
   public static int field8553;
   @OriginalMember(
      owner = "client!jw",
      name = "H",
      descriptor = "I"
   )
   public static int field8555;

   @OriginalMember(
      owner = "client!jw",
      name = "d",
      descriptor = "(B)V",
      line = 7
   )
   public static final void method4206(byte arg0) {
      try {
         int var1 = 21 / ((arg0 - -68) / 55);
         ++field8555;
         if (class716.field10409 != class290.field4016) {
            try {
               class548.method3934(class220.field3148, false, field8556[8]);
            } catch (Throwable var3) {
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8556[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "()V",
      line = 26
   )
   public class581() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!jw",
      name = "d",
      descriptor = "(I)V",
      line = 39
   )
   public static final void method4207(int arg0) {
      try {
         if (class218.field3125 != null) {
            class218.field3125.method1541(false);
         }

         ++field8550;
         if (class393.field5688 != null) {
            class393.field5688.method1541(false);
         }

         if (arg0 != 50) {
            field8554 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8556[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "(B)V",
      line = 56
   )
   public static void method4208(byte arg0) {
      try {
         if (arg0 <= 66) {
            method4207(-57);
         }

         field8554 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8556[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(II)[I",
      line = 70
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8546;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = -40 % ((24 - arg1) / 44);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0);
            int var7 = 0;
            if (var3 || ~var7 > ~class430.field6152) {
               do {
                  int var8 = var6[var7];
                  var4[var7] = ~this.field8549 >= ~var8 ? (var8 > this.field8547 ? 0 : 4096) : 0;
                  ++var7;
               } while(~var7 > ~class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8556[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 103
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 <= 49) {
            field8551 = 77;
         }

         label36: {
            label35: {
               if (arg0 != 0) {
                  if (~arg0 != -2) {
                     break label36;
                  }

                  if (!var4) {
                     break label35;
                  }
               }

               this.field8549 = arg1.method1211(-26166);
               if (!var4) {
                  break label36;
               }
            }

            this.field8547 = arg1.method1211(-26166);
         }

         ++field8553;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8556[4] + arg0 + ',' + (arg1 != null ? field8556[3] : field8556[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "c",
      descriptor = "(B)V",
      line = 139
   )
   public static final void method4209(byte arg0) {
      try {
         class534.field7614 = new class245[50];
         class673.field9755 = 0;
         if (arg0 == 88) {
            ++field8552;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8556[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

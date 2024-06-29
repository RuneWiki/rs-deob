import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class487 {
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "I"
   )
   private int field6711 = 0;
   @OriginalMember(
      owner = "client!sl",
      name = "l",
      descriptor = "I"
   )
   private int field6708 = -1;
   @OriginalMember(
      owner = "client!sl",
      name = "k",
      descriptor = "Lod;"
   )
   private class536 field6709 = new class536();
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "Z"
   )
   public boolean field6719 = false;
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "I"
   )
   private int field6707;
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "I"
   )
   private int field6713;
   @OriginalMember(
      owner = "client!sl",
      name = "h",
      descriptor = "[[[I"
   )
   private int[][][] field6706;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "[Ltp;"
   )
   private class563[] field6717;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6721 = new String[]{method3546(method3545("LwBG\u0013azUG\u000ejb^\u000e\u0019ys\f\u0006\\ic@\u000b\\f{M\u0000\u0019/uM\u0004\u0014j")), method3546(method3545("|z\u0002&T")), method3546(method3545("|z\u0002[\u0015a\u007fXYT")), method3546(method3545("|z\u0002$T")), method3546(method3545("|z\u0002%T")), method3546(method3545("|z\u0002#T"))};
   @OriginalMember(
      owner = "client!sl",
      name = "n",
      descriptor = "S"
   )
   public static short field6716;
   @OriginalMember(
      owner = "client!sl",
      name = "o",
      descriptor = "Lbga;"
   )
   public static class378 field6714;
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "Lnw;"
   )
   public static class616 field6720;
   @OriginalMember(
      owner = "client!sl",
      name = "i",
      descriptor = "I"
   )
   public static int field6710;
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "I"
   )
   public static int field6712;
   @OriginalMember(
      owner = "client!sl",
      name = "j",
      descriptor = "I"
   )
   public static int field6715;
   @OriginalMember(
      owner = "client!sl",
      name = "m",
      descriptor = "[J"
   )
   public static long[] field6718;

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(B)[[[I"
   )
   public final int[][][] method3540(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field6712;
         if (~this.field6713 != ~this.field6707) {
            throw new RuntimeException(field6721[0]);
         } else {
            int var3 = -45 % ((arg0 - -47) / 47);
            int var4 = 0;
            if (var2) {
               this.field6717[var4] = class14.field181;
               ++var4;
            }

            while(true) {
               class487 var10000;
               if (var4 >= this.field6713) {
                  var10000 = this;
                  if (!var2) {
                     return this.field6706;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field6717[var4] = class14.field181;
               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6721[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3541(int arg0) {
      boolean var2 = client.field4273;

      try {
         int var3 = 0;
         if (var2) {
            this.field6706[var3][0] = null;
            this.field6706[var3][1] = null;
            this.field6706[var3][2] = null;
            this.field6706[var3] = null;
            ++var3;
         }

         while(true) {
            while(~this.field6713 < ~var3) {
               this.field6706[var3][0] = null;
               this.field6706[var3][1] = null;
               this.field6706[var3][2] = null;
               this.field6706[var3] = null;
               ++var3;
            }

            ++field6710;
            this.field6717 = null;
            this.field6706 = null;
            if (!var2) {
               if (arg0 > -126) {
                  return;
               }

               this.field6709.method3861(113);
               this.field6709 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6721[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(IIILmi;)V"
   )
   public static final void method3542(int arg0, int arg1, int arg2, class525 arg3) {
      class225 var4 = class12.method96(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field2820 = arg3;
         int var5 = class93.field1241 == class73.field900 ? 1 : 0;
         if (arg3.method780(22)) {
            if (arg3.method775(0)) {
               arg3.field1004 = class735.field10736[var5];
               class735.field10736[var5] = arg3;
               return;
            }

            arg3.field1004 = class8.field111[var5];
            class8.field111[var5] = arg3;
            class591.field8180 = true;
            return;
         }

         arg3.field1004 = class234.field2900[var5];
         class234.field2900[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method3543(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 != -2) {
            this.field6713 = 47;
         }

         ++field6715;
         if (~this.field6713 == ~this.field6707) {
            this.field6719 = this.field6717[arg1] == null;
            this.field6717[arg1] = class14.field181;
            return this.field6706[arg1];
         } else if (~this.field6713 == -2) {
            this.field6719 = ~this.field6708 != ~arg1;
            this.field6708 = arg1;
            return this.field6706[0];
         } else {
            class563 var4;
            label43: {
               var4 = this.field6717[arg1];
               if (var4 == null) {
                  label40: {
                     this.field6719 = true;
                     if (this.field6711 < this.field6713) {
                        var4 = new class563(arg1, this.field6711);
                        ++this.field6711;
                        if (!var3) {
                           break label40;
                        }
                     }

                     class563 var5 = (class563)this.field6709.method3863((byte)125);
                     var4 = new class563(arg1, var5.field7698);
                     this.field6717[var5.field7695] = null;
                     var5.method3609(101);
                  }

                  this.field6717[arg1] = var4;
                  if (!var3) {
                     break label43;
                  }
               }

               this.field6719 = false;
            }

            this.field6709.method3867(var4, 125);
            return this.field6706[var4.field7698];
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6721[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3544(int arg0) {
      try {
         field6714 = null;
         if (arg0 != 0) {
            field6720 = null;
         }

         field6720 = null;
         field6718 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6721[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class487(int arg0, int arg1, int arg2) {
      try {
         this.field6707 = arg1;
         this.field6713 = arg0;
         this.field6706 = new int[this.field6713][3][arg2];
         this.field6717 = new class563[this.field6707];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6721[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      new class394("", 73);
      field6716 = 1;
      field6714 = new class378(71, -1);
      field6720 = new class616(56, 8);
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3545(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3546(char[] arg0) {
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
            var10005 = 22;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

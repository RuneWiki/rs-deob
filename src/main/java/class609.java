import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class609 implements class723 {
   @OriginalMember(
      owner = "client!id",
      name = "c",
      descriptor = "Llga;"
   )
   private class739 field8736;
   @OriginalMember(
      owner = "client!id",
      name = "j",
      descriptor = "I"
   )
   public int field8741;
   @OriginalMember(
      owner = "client!id",
      name = "i",
      descriptor = "[I"
   )
   public int[] field8740;
   @OriginalMember(
      owner = "client!id",
      name = "d",
      descriptor = "I"
   )
   public int field8735;
   @OriginalMember(
      owner = "client!id",
      name = "e",
      descriptor = "Lvha;"
   )
   private class712 field8743;
   @OriginalMember(
      owner = "client!id",
      name = "f",
      descriptor = "[F"
   )
   public float[] field8738;
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8744 = new String[]{method4469(method4468(";@\u0007\\F")), method4469(method4468("<QEs")), method4469(method4468(")\n\u00071\u0013")), method4469(method4468(";@\u0007#\u0007<M]!F")), method4469(method4468(";@\u0007^F")), method4469(method4468(";@\u0007]F"))};
   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "I"
   )
   public static int field8734;
   @OriginalMember(
      owner = "client!id",
      name = "b",
      descriptor = "I"
   )
   public static int field8737;
   @OriginalMember(
      owner = "client!id",
      name = "h",
      descriptor = "I"
   )
   public static int field8739;
   @OriginalMember(
      owner = "client!id",
      name = "g",
      descriptor = "I"
   )
   public static int field8742;

   @OriginalMember(
      owner = "client!id",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method4465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class20.method144(arg5, !arg6 ? null : this.field8740, this.field8736.field10605.field1778, arg7 ? this.field8738 : null, arg3, arg1, !arg7 ? null : this.field8736.field10629, this.field8736.field10605.field1780, arg0, this.field8735, arg2, (byte)95, arg4);
         ++field8742;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8744[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method4466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         ++field8739;
         class20.method144(arg5, !arg6 ? null : this.field8736.field10605.field1778, this.field8740, arg7 ? this.field8736.field10629 : null, arg3, arg1, !arg7 ? null : this.field8738, this.field8735, arg0, this.field8736.field10605.field1780, arg2, (byte)95, arg4);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8744[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4467(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 22311) {
            method4467(101, -22, 108);
         }

         ++field8737;
         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8744[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Llga;Ltd;Lvha;)V"
   )
   public class609(class739 arg0, class476 arg1, class712 arg2) {
      try {
         label55: {
            this.field8736 = arg0;
            if (arg1 instanceof class467) {
               class467 var4 = (class467)arg1;
               this.field8741 = var4.field5727;
               this.field8740 = var4.field6818;
               this.field8735 = var4.field5704;
               if (!client.field4564) {
                  break label55;
               }
            }

            if (!(arg1 instanceof class156)) {
               throw new RuntimeException();
            }

            class156 var5 = (class156)arg1;
            this.field8735 = var5.field5704;
            this.field8741 = var5.field5727;
            this.field8740 = var5.field2509;
         }

         if (arg2 != null) {
            this.field8743 = arg2;
            if (this.field8743.field10337 == this.field8735 && this.field8743.field10340 == this.field8741) {
               this.field8738 = this.field8743.field10338;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8744[3] + (arg0 != null ? field8744[2] : field8744[1]) + ',' + (arg1 != null ? field8744[2] : field8744[1]) + ',' + (arg2 != null ? field8744[2] : field8744[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

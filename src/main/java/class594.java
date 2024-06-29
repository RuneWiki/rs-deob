import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class594 {
   @OriginalMember(
      owner = "client!um",
      name = "t",
      descriptor = "Lrca;"
   )
   private class37 field8752 = new class37();
   @OriginalMember(
      owner = "client!um",
      name = "k",
      descriptor = "I"
   )
   private int field8763 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "B",
      descriptor = "Lgea;"
   )
   private class66 field8762 = new class66(1350);
   @OriginalMember(
      owner = "client!um",
      name = "v",
      descriptor = "Lmb;"
   )
   public class431 field8764 = new class431(15000);
   @OriginalMember(
      owner = "client!um",
      name = "d",
      descriptor = "Z"
   )
   public boolean field8768 = false;
   @OriginalMember(
      owner = "client!um",
      name = "x",
      descriptor = "Z"
   )
   public boolean field8766 = true;
   @OriginalMember(
      owner = "client!um",
      name = "p",
      descriptor = "Laka;"
   )
   public class418 field8769 = null;
   @OriginalMember(
      owner = "client!um",
      name = "n",
      descriptor = "I"
   )
   public int field8776 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "h",
      descriptor = "I"
   )
   public int field8778 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "A",
      descriptor = "I"
   )
   public int field8767 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8779 = new String[]{method4426(method4425("w>\u0016\u0018\\")), method4426(method4425("w>\u0016\u0019\\")), method4426(method4425("w>\u0016\u001a\\")), method4426(method4425("w>\u0016\u001e\\")), method4426(method4425("l&T0")), method4426(method4425("y}\u0016r\t")), method4426(method4425("w>\u0016\u001d\\")), method4426(method4425("w>\u0016\u001f\\"))};
   @OriginalMember(
      owner = "client!um",
      name = "r",
      descriptor = "I"
   )
   public static int field8751 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "g",
      descriptor = "J"
   )
   public static long field8757 = -1L;
   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field8761 = new class6(0, -1);
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "I"
   )
   public static int field8754;
   @OriginalMember(
      owner = "client!um",
      name = "j",
      descriptor = "I"
   )
   public static int field8755;
   @OriginalMember(
      owner = "client!um",
      name = "s",
      descriptor = "I"
   )
   public static int field8756;
   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "I"
   )
   public static int field8758;
   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "I"
   )
   public static int field8759;
   @OriginalMember(
      owner = "client!um",
      name = "o",
      descriptor = "I"
   )
   private int field8770;
   @OriginalMember(
      owner = "client!um",
      name = "u",
      descriptor = "I"
   )
   public int field8771;
   @OriginalMember(
      owner = "client!um",
      name = "w",
      descriptor = "I"
   )
   public int field8772;
   @OriginalMember(
      owner = "client!um",
      name = "e",
      descriptor = "I"
   )
   public int field8773;
   @OriginalMember(
      owner = "client!um",
      name = "f",
      descriptor = "Laka;"
   )
   public class418 field8774;
   @OriginalMember(
      owner = "client!um",
      name = "q",
      descriptor = "Laka;"
   )
   public class418 field8775;
   @OriginalMember(
      owner = "client!um",
      name = "y",
      descriptor = "Laka;"
   )
   public class418 field8777;
   @OriginalMember(
      owner = "client!um",
      name = "l",
      descriptor = "Lnw;"
   )
   public class698 field8760;
   @OriginalMember(
      owner = "client!um",
      name = "m",
      descriptor = "Lit;"
   )
   public class769 field8750;
   @OriginalMember(
      owner = "client!um",
      name = "C",
      descriptor = "Lps;"
   )
   public class7 field8765;
   @OriginalMember(
      owner = "client!um",
      name = "i",
      descriptor = "[Lgn;"
   )
   public static class593[] field8753;

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4419(int arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         ++field8758;
         if (arg0 < 80) {
            this.method4424(-32);
         }

         if (this.field8760 != null && this.field8763 > 0) {
            this.field8762.field864 = 0;

            while(true) {
               class702 var3 = (class702)this.field8752.method288(0);
               if (var3 != null) {
                  if (var2) {
                     break;
                  }

                  if (var3.field10263 <= this.field8762.field859.length - this.field8762.field864) {
                     this.field8762.method601(76, var3.field10263, 0, var3.field10264.field859);
                     this.field8763 -= var3.field10263;
                     var3.method4924(-2970);
                     var3.field10264.method651(true);
                     var3.method5108(-1);
                     if (!var2) {
                        continue;
                     }
                  }
               }

               this.field8760.method1048(this.field8762.field859, 0, -1, this.field8762.field864);
               this.field8770 += this.field8762.field864;
               this.field8778 = 0;
               break;
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8779[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4420(boolean arg0) {
      try {
         if (class413.field5678 % 50 == 0) {
            this.field8773 = this.field8770;
            this.field8772 = this.field8771;
            this.field8770 = 0;
            this.field8771 = 0;
         }

         if (arg0) {
            ++field8754;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8779[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4421(boolean arg0) {
      try {
         field8761 = null;
         field8753 = null;
         if (!arg0) {
            field8751 = -120;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8779[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4422(byte arg0) {
      try {
         if (this.field8760 != null) {
            this.field8760.method1050(9);
            this.field8760 = null;
         }

         ++field8755;
         if (arg0 >= -35) {
            method4421(false);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8779[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Lfv;B)V"
   )
   public final void method4423(class702 arg0, byte arg1) {
      try {
         if (arg1 < 95) {
            field8753 = null;
         }

         ++field8759;
         this.field8752.method279(false, arg0);
         arg0.field10263 = arg0.field10264.field864;
         arg0.field10264.field864 = 0;
         this.field8763 += arg0.field10263;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8779[3] + (arg0 != null ? field8779[5] : field8779[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4424(int arg0) {
      try {
         ++field8756;
         this.field8752.method289(true);
         this.field8763 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8779[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4425(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4426(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class638 extends class396 {
   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "I"
   )
   private int field9269 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "u",
      descriptor = "I"
   )
   private int field9272 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "p",
      descriptor = "I"
   )
   private int field9291 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "s",
      descriptor = "I"
   )
   private int field9275 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "f",
      descriptor = "Z"
   )
   private boolean field9282 = false;
   @OriginalMember(
      owner = "client!cia",
      name = "g",
      descriptor = "I"
   )
   private int field9288 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "o",
      descriptor = "Lck;"
   )
   private class667 field9270;
   @OriginalMember(
      owner = "client!cia",
      name = "r",
      descriptor = "Lfe;"
   )
   private class596 field9268;
   @OriginalMember(
      owner = "client!cia",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9299 = new String[]{method4595(method4594("E\f+/\bO\u000b#u\n\u000e")), method4595(method4594("]Kd/I")), method4595(method4594("H\u0010&m")), method4595(method4594("E\f+/r\u000e")), method4595(method4594("E\f+/~\u000e")), method4595(method4594("E\f+/y\u000e")), method4595(method4594("E\f+/\u007f\u000e")), method4595(method4594("E\f+/{\u000e")), method4595(method4594("E\f+/`\u000e")), method4595(method4594("E\f+/e\u000e")), method4595(method4594("E\f+/|\u000e")), method4595(method4594("E\f+/s\u000e")), method4595(method4594("E\f+/w\u000e")), method4595(method4594("E\f+/q\u000e")), method4595(method4594("E\f+/v\u000e")), method4595(method4594("E\f+/}\u000e")), method4595(method4594("E\f+/p\u000e")), method4595(method4594("E\f+/z\u000e")), method4595(method4594("E\f+/x\u000e")), method4595(method4594("E\f+/g\u000e")), method4595(method4594("E\f+/u\u000e")), method4595(method4594("E\f+/d\u000e"))};
   @OriginalMember(
      owner = "client!cia",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field9286 = new int[256];
   @OriginalMember(
      owner = "client!cia",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field9280 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!cia",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field9292 = new int[3];
   @OriginalMember(
      owner = "client!cia",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field9289 = new class269(7, 3);
   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "I"
   )
   public static int field9267;
   @OriginalMember(
      owner = "client!cia",
      name = "F",
      descriptor = "I"
   )
   public static int field9271;
   @OriginalMember(
      owner = "client!cia",
      name = "j",
      descriptor = "I"
   )
   public static int field9273;
   @OriginalMember(
      owner = "client!cia",
      name = "e",
      descriptor = "I"
   )
   public static int field9274;
   @OriginalMember(
      owner = "client!cia",
      name = "B",
      descriptor = "I"
   )
   public static int field9277;
   @OriginalMember(
      owner = "client!cia",
      name = "y",
      descriptor = "I"
   )
   public static int field9278;
   @OriginalMember(
      owner = "client!cia",
      name = "t",
      descriptor = "I"
   )
   public static int field9279;
   @OriginalMember(
      owner = "client!cia",
      name = "v",
      descriptor = "I"
   )
   public static int field9281;
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "I"
   )
   public static int field9283;
   @OriginalMember(
      owner = "client!cia",
      name = "x",
      descriptor = "I"
   )
   public static int field9284;
   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "I"
   )
   public static int field9285;
   @OriginalMember(
      owner = "client!cia",
      name = "k",
      descriptor = "I"
   )
   public static int field9287;
   @OriginalMember(
      owner = "client!cia",
      name = "q",
      descriptor = "I"
   )
   public static int field9290;
   @OriginalMember(
      owner = "client!cia",
      name = "w",
      descriptor = "I"
   )
   public static int field9293;
   @OriginalMember(
      owner = "client!cia",
      name = "n",
      descriptor = "I"
   )
   public static int field9294;
   @OriginalMember(
      owner = "client!cia",
      name = "E",
      descriptor = "I"
   )
   public static int field9295;
   @OriginalMember(
      owner = "client!cia",
      name = "m",
      descriptor = "I"
   )
   public static int field9296;
   @OriginalMember(
      owner = "client!cia",
      name = "h",
      descriptor = "I"
   )
   public static int field9298;
   @OriginalMember(
      owner = "client!cia",
      name = "C",
      descriptor = "Lfe;"
   )
   private class596 field9276;
   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field9297;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 5
   )
   public final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9296;
         this.field9268.method5012((arg7 & 1) != 0, -10161);
         this.field9270.method4817((byte)-52);
         this.field9270.method4854(-3, arg6);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (!this.field9282) {
            if (this.field9276 == null) {
               this.field9270.method4818((byte)80, this.field9268);
               this.field9270.method4796(false, arg4);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
               OpenGL.glVertex2i(arg0 - -arg2, arg1 + arg3);
               OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
            } else {
               this.method4589(0, arg4);
               this.field9276.method5012(true, -10161);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9268.field8777);
               OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, 0.0F);
               OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
               OpenGL.glVertex2i(arg0 - -arg2, arg1 - -arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, this.field9268.field8777);
               OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
               this.method4591(124);
            }
         } else {
            float var9 = (float)arg2 / (float)this.method1971();
            float var10 = (float)arg3 / (float)this.method1975();
            float var11 = (float)this.field9272 * var9 + (float)arg0;
            float var12 = (float)this.field9269 * var10 + (float)arg1;
            float var13 = (float)this.field9268.field8779 * var9 + var11;
            float var14 = (float)this.field9268.field8783 * var10 + var12;
            if (this.field9276 != null) {
               this.method4589(0, arg4);
               this.field9276.method5012(true, -10161);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9268.field8777);
               OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, 0.0F);
               OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, this.field9268.field8777);
               OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
               this.method4591(124);
            } else {
               this.field9270.method4818((byte)-124, this.field9268);
               this.field9270.method4796(false, arg4);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field9299[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 109
   )
   public final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field9294;
         int var9 = arg0 + arg2;
         int var10 = arg1 + arg3;
         this.field9268.method5012(false, -10161);
         this.field9270.method4817((byte)-52);
         this.field9270.method4818((byte)115, this.field9268);
         this.field9270.method4854(-3, arg6);
         this.field9270.method4796(false, arg4);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field9268.field8782 && !this.field9282) {
            float var11 = (float)arg3 * this.field9268.field8777 / (float)this.field9268.field8783;
            float var12 = (float)arg2 * this.field9268.field8778 / (float)this.field9268.field8779;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var11);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var10);
            OpenGL.glTexCoord2f(var12, 0.0F);
            OpenGL.glVertex2i(var9, var10);
            OpenGL.glTexCoord2f(var12, var11);
            OpenGL.glVertex2i(var9, arg1);
            OpenGL.glEnd();
         } else {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef((float)this.field9272, (float)this.field9269, 0.0F);
            int var13 = this.method1971();
            int var14 = this.method1975();
            int var15 = this.field9268.field8783 + arg1;
            OpenGL.glBegin(7);
            int var16 = arg1;
            int var10000;
            int var17;
            int var10001;
            int var18;
            float var20;
            int var21;
            int var22;
            float var23;
            if (var8 != 0) {
               var17 = this.field9268.field8779 + arg0;
               var18 = arg0;
               if (var8 != 0) {
                  OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            } else {
               if (~var10 > ~var15) {
                  var10000 = arg1;
                  var10001 = var10;
                  if (var8 == 0) {
                     if (arg1 < var10) {
                        var20 = (float)(-var10 + arg1 + this.field9268.field8783) * this.field9268.field8777 / (float)this.field9268.field8783;
                        var21 = this.field9268.field8779 + arg0;
                        var22 = arg0;
                        if (var8 != 0) {
                           OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                           OpenGL.glVertex2i(arg0, arg1);
                           OpenGL.glTexCoord2f(0.0F, var20);
                           OpenGL.glVertex2i(arg0, var10);
                           OpenGL.glTexCoord2f(this.field9268.field8778, var20);
                           OpenGL.glVertex2i(var21, var10);
                           OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                           OpenGL.glVertex2i(var21, arg1);
                           var21 += var13;
                           var22 = arg0 + var13;
                        }

                        while(true) {
                           while(var9 >= var21) {
                              OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                              OpenGL.glVertex2i(var22, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(var22, var10);
                              OpenGL.glTexCoord2f(this.field9268.field8778, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 += var13;
                           }

                           var10000 = ~var22;
                           var10001 = ~var9;
                           if (var8 == 0) {
                              if (var10000 > var10001) {
                                 var23 = (float)(-var22 + var9) * this.field9268.field8778 / (float)this.field9268.field8779;
                                 OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(var23, var20);
                                 OpenGL.glVertex2i(var9, var10);
                                 OpenGL.glTexCoord2f(var23, this.field9268.field8777);
                                 OpenGL.glVertex2i(var9, var16);
                              }
                              break;
                           }

                           var22 = var10000 + var10001;
                        }
                     }

                     OpenGL.glEnd();
                     OpenGL.glPopMatrix();
                     return;
                  }
               } else {
                  var10000 = this.field9268.field8779;
                  var10001 = arg0;
               }

               var17 = var10000 + var10001;
               var18 = arg0;
               if (var8 != 0) {
                  OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            }

            while(true) {
               while(~var9 <= ~var17) {
                  OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                  OpenGL.glVertex2i(var18, var16);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(var18, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                  OpenGL.glVertex2i(var17, var16);
                  var18 += var13;
                  var17 += var13;
               }

               if (var8 == 0) {
                  if (var9 > var18) {
                     float var19 = (float)(var9 - var18) * this.field9268.field8778 / (float)this.field9268.field8779;
                     OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                     OpenGL.glVertex2i(var18, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(var18, var15);
                     OpenGL.glTexCoord2f(var19, 0.0F);
                     OpenGL.glVertex2i(var9, var15);
                     OpenGL.glTexCoord2f(var19, this.field9268.field8777);
                     OpenGL.glVertex2i(var9, var16);
                  }

                  var15 += var14;
                  var16 += var14;
                  if (~var10 > ~var15) {
                     var10000 = var16;
                     var10001 = var10;
                     if (var8 == 0) {
                        if (var16 < var10) {
                           var20 = (float)(-var10 + var16 + this.field9268.field8783) * this.field9268.field8777 / (float)this.field9268.field8783;
                           var21 = this.field9268.field8779 + arg0;
                           var22 = arg0;
                           if (var8 != 0) {
                              OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                              OpenGL.glVertex2i(arg0, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(arg0, var10);
                              OpenGL.glTexCoord2f(this.field9268.field8778, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 = arg0 + var13;
                           }

                           while(true) {
                              while(var9 >= var21) {
                                 OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(this.field9268.field8778, var20);
                                 OpenGL.glVertex2i(var21, var10);
                                 OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                                 OpenGL.glVertex2i(var21, var16);
                                 var21 += var13;
                                 var22 += var13;
                              }

                              var10000 = ~var22;
                              var10001 = ~var9;
                              if (var8 == 0) {
                                 if (var10000 > var10001) {
                                    var23 = (float)(-var22 + var9) * this.field9268.field8778 / (float)this.field9268.field8779;
                                    OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                                    OpenGL.glVertex2i(var22, var16);
                                    OpenGL.glTexCoord2f(0.0F, var20);
                                    OpenGL.glVertex2i(var22, var10);
                                    OpenGL.glTexCoord2f(var23, var20);
                                    OpenGL.glVertex2i(var9, var10);
                                    OpenGL.glTexCoord2f(var23, this.field9268.field8777);
                                    OpenGL.glVertex2i(var9, var16);
                                 }
                                 break;
                              }

                              var22 = var10000 + var10001;
                           }
                        }

                        OpenGL.glEnd();
                        OpenGL.glPopMatrix();
                        return;
                     }
                  } else {
                     var10000 = this.field9268.field8779;
                     var10001 = arg0;
                  }

                  var17 = var10000 + var10001;
                  var18 = arg0;
                  if (var8 != 0) {
                     OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
                     OpenGL.glVertex2i(arg0, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(arg0, var15);
                     OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
                     OpenGL.glVertex2i(var17, var15);
                     OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
                     OpenGL.glVertex2i(var17, var16);
                     var18 = var13 + arg0;
                     var17 += var13;
                  }
               } else {
                  var17 = var9 + var18;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field9299[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(II)V",
      line = 248
   )
   private final void method4589(int arg0, int arg1) {
      try {
         this.field9270.method4828(1, (byte)66);
         ++field9298;
         this.field9270.method4818((byte)-108, this.field9268);
         this.field9270.method4849(7681, 34161, this.field9270.method4837(true, arg1));
         this.field9270.method4814(arg0 + 7681, 1, 34167, 768);
         this.field9270.method4823(34168, 0, 770, (byte)108);
         this.field9270.method4828(arg0, (byte)66);
         this.field9270.method4818((byte)-126, this.field9276);
         this.field9270.method4849(7681, 34161, 34479);
         this.field9270.method4814(7681, 1, 34166, 768);
         if (~this.field9275 != -1) {
            if (this.field9275 != 1) {
               if (this.field9275 != 2) {
                  if (this.field9275 == 3) {
                     this.field9270.method4779(128.5F, 0.0F, 128.5F, 122, 128.5F);
                     return;
                  }
               } else {
                  this.field9270.method4779(0.5F, 0.0F, 0.5F, 126, 1.0F);
               }

            } else {
               this.field9270.method4779(1.0F, 0.0F, 0.5F, 121, 0.5F);
            }
         } else {
            this.field9270.method4779(0.5F, 0.0F, 1.0F, arg0 + 119, 0.5F);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9299[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "()I",
      line = 280
   )
   public final int method1975() {
      try {
         ++field9285;
         return this.field9269 - -this.field9291 + this.field9268.field8783;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9299[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lck;IIZ)V",
      line = 693
   )
   public class638(class667 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field9270 = arg0;
         this.field9268 = class46.method362(arg3 ? 6408 : 6407, arg1, (byte)93, arg0, arg2);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9299[0] + (arg0 != null ? field9299[1] : field9299[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lck;IIII)V",
      line = 703
   )
   public class638(class667 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field9270 = arg0;
         this.field9268 = class147.method1213(arg3, arg4, arg1, arg2, arg0, -24018);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9299[0] + (arg0 != null ? field9299[1] : field9299[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lck;II[III)V",
      line = 713
   )
   public class638(class667 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field9270 = arg0;
         this.field9268 = class159.method1319(arg0, false, arg2, (byte)-120, arg5, arg1, arg4, arg3);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9299[0] + (arg0 != null ? field9299[1] : field9299[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9299[1] : field9299[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "()I",
      line = 291
   )
   public final int method1965() {
      try {
         ++field9278;
         return this.field9268.field8779;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9299[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIII[III)V",
      line = 303
   )
   private final void method4590(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         ++field9293;
         this.field9268.method1898(true, arg6, arg3, arg1, arg0, arg5, arg4, 3314, arg2);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9299[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9299[1] : field9299[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V",
      line = 314
   )
   private final void method4591(int arg0) {
      try {
         this.field9270.method4828(1, (byte)66);
         ++field9279;
         this.field9270.method4818((byte)123, (class689)null);
         this.field9270.method4849(8448, 34161, 8448);
         this.field9270.method4814(7681, 1, 34168, 768);
         if (arg0 < 89) {
            this.field9291 = 37;
         }

         this.field9270.method4823(5890, 0, 770, (byte)109);
         this.field9270.method4828(0, (byte)66);
         this.field9270.method4814(7681, 1, 34168, 768);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9299[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(B)V",
      line = 339
   )
   public static void method4592(byte arg0) {
      try {
         int var1 = -74 / ((arg0 - 75) / 47);
         field9286 = null;
         field9292 = null;
         field9289 = null;
         field9297 = null;
         field9280 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9299[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "([I)V",
      line = 353
   )
   public final void method1969(int[] arg0) {
      try {
         arg0[0] = this.field9272;
         arg0[1] = this.field9269;
         ++field9274;
         arg0[2] = this.field9288;
         arg0[3] = this.field9291;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9299[10] + (arg0 != null ? field9299[1] : field9299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(III)V",
      line = 367
   )
   public final void method263(int arg0, int arg1, int arg2) {
      try {
         ++field9273;
         OpenGL.glPixelTransferf(3348, 0.5F);
         OpenGL.glPixelTransferf(3349, 0.499F);
         OpenGL.glPixelTransferf(3352, 0.5F);
         OpenGL.glPixelTransferf(3353, 0.499F);
         OpenGL.glPixelTransferf(3354, 0.5F);
         OpenGL.glPixelTransferf(3355, 0.499F);
         this.field9276 = class147.method1213(this.field9268.field8779, this.field9268.field8783, arg0, arg1, this.field9270, -24018);
         this.field9275 = arg2;
         OpenGL.glPixelTransferf(3348, 1.0F);
         OpenGL.glPixelTransferf(3349, 0.0F);
         OpenGL.glPixelTransferf(3352, 1.0F);
         OpenGL.glPixelTransferf(3353, 0.0F);
         OpenGL.glPixelTransferf(3354, 1.0F);
         OpenGL.glPixelTransferf(3355, 0.0F);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9299[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "(II)Z",
      line = 390
   )
   public static final boolean method4593(int arg0, int arg1) {
      try {
         if (arg0 != -341283472) {
            field9297 = null;
         }

         ++field9277;
         return ~arg1 == -2 || arg1 == 3 || ~arg1 == -6;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9299[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 405
   )
   public final void method1970(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
      try {
         ++field9287;
         class596 var11 = ((class364)arg7).field5462;
         if (this.field9282) {
            float var12 = (float)this.method1971();
            float var13 = (float)this.method1975();
            float var14 = (-arg0 + arg2) / var12;
            float var15 = (-arg1 + arg3) / var12;
            float var16 = (-arg0 + arg4) / var13;
            float var17 = (-arg1 + arg5) / var13;
            float var18 = (float)this.field9269 * var16;
            float var19 = (float)this.field9269 * var17;
            float var20 = (float)this.field9272 * var14;
            float var21 = (float)this.field9272 * var15;
            float var22 = (float)this.field9288 * -var14;
            float var23 = (float)this.field9288 * -var15;
            float var24 = (float)this.field9291 * -var16;
            arg3 = arg3 + var23 + var19;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float)this.field9291 * -var17;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
         }

         float var26 = arg2 - arg0 + arg4;
         this.field9268.method5012(~(1 & arg6) != -1, -10161);
         float var27 = arg5 - arg1 + arg3;
         this.field9270.method4817((byte)-94);
         this.field9270.method4818((byte)-126, this.field9268);
         this.field9270.method4796(false, 1);
         this.field9270.method4828(1, (byte)66);
         this.field9270.method4818((byte)-122, var11);
         this.field9270.method4849(8448, 34161, 7681);
         this.field9270.method4814(7681, 0, 34168, 768);
         this.field9270.method4854(-3, 1);
         float var28 = var11.field8778 / (float)var11.field8779;
         float var29 = var11.field8777 / (float)var11.field8783;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9268.field8777);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg0) * var28, -((arg1 - (float)arg9) * var29) + var11.field8777);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg4) * var28, var11.field8777 - ((float)(-arg9) + arg5) * var29);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glMultiTexCoord2f(33984, this.field9268.field8778, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + var26) * var28, -((var27 - (float)arg9) * var29) + var11.field8777);
         OpenGL.glVertex2f(var26, var27);
         OpenGL.glMultiTexCoord2f(33984, this.field9268.field8778, this.field9268.field8777);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg2) * var28, -((arg3 - (float)arg9) * var29) + var11.field8777);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
         this.field9270.method4814(7681, 0, 5890, 768);
         this.field9270.method4796(false, 0);
         this.field9270.method4818((byte)43, (class689)null);
         this.field9270.method4828(0, (byte)66);
      } catch (RuntimeException var31) {
         throw class670.method4877(var31, field9299[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9299[1] : field9299[2]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(IIII)V",
      line = 495
   )
   public final void method1976(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9291 = arg3;
         this.field9288 = arg2;
         ++field9284;
         this.field9269 = arg1;
         this.field9272 = arg0;
         this.field9282 = ~this.field9272 != -1 || ~this.field9269 != -1 || this.field9288 != 0 || ~this.field9291 != -1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9299[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "()I",
      line = 511
   )
   public final int method1971() {
      try {
         ++field9281;
         return this.field9268.field8779 - -this.field9272 + this.field9288;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9299[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 527
   )
   public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9283;
         this.field9268.method5012(false, -10161);
         this.field9270.method4817((byte)-110);
         this.field9270.method4854(-3, arg4);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         int var8 = this.field9272 + arg0;
         int var9 = this.field9269 + arg1;
         if (this.field9276 == null) {
            this.field9270.method4818((byte)15, this.field9268);
            this.field9270.method4796(false, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field9268.field8783 + var9);
            OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
            OpenGL.glVertex2i(this.field9268.field8779 + var8, this.field9268.field8783 + var9);
            OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
            OpenGL.glVertex2i(this.field9268.field8779 + var8, var9);
            OpenGL.glEnd();
         } else {
            this.method4589(0, arg2);
            this.field9276.method5012(false, -10161);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9268.field8777);
            OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, var9 - -this.field9268.field8783);
            OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, 0.0F);
            OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
            OpenGL.glVertex2i(this.field9268.field8779 + var8, this.field9268.field8783 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field9268.field8778, this.field9268.field8777);
            OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
            OpenGL.glVertex2i(var8 - -this.field9268.field8779, var9);
            OpenGL.glEnd();
            this.method4591(102);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9299[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 586
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = client.field4530;

      try {
         label45: {
            if (this.field9270.field9971) {
               int[] var8 = this.field9270.method569(arg4, arg5, arg2, arg3);
               if (var8 == null) {
                  break label45;
               }

               int var9 = 0;
               if (var7 != 0) {
                  var8[var9] = class379.method2928(var8[var9], -16777216);
                  ++var9;
               }

               while(true) {
                  while(var8.length > var9) {
                     var8[var9] = class379.method2928(var8[var9], -16777216);
                     ++var9;
                  }

                  this.method4590(arg0, arg1, arg2, arg3, var8, 0, arg2);
                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label45;
                     }
                     break;
                  }

                  ++var9;
               }
            }

            this.field9268.method1897((byte)-88, arg1, arg2, arg5, arg3, arg4, arg0);
         }

         ++field9290;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field9299[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "()I",
      line = 619
   )
   public final int method1967() {
      try {
         ++field9295;
         return this.field9268.field8783;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9299[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IILaa;II)V",
      line = 631
   )
   public final void method262(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
      try {
         ++field9267;
         class364 var6 = (class364)arg2;
         class596 var7 = var6.field5462;
         this.field9268.method5012(false, -10161);
         this.field9270.method4817((byte)-56);
         this.field9270.method4818((byte)80, this.field9268);
         this.field9270.method4796(false, 1);
         this.field9270.method4828(1, (byte)66);
         this.field9270.method4818((byte)-112, var7);
         this.field9270.method4849(8448, 34161, 7681);
         this.field9270.method4814(7681, 0, 34168, 768);
         this.field9270.method4854(-3, 1);
         int var18 = this.field9272 + arg0;
         int var19 = this.field9269 + arg1;
         int var8 = this.field9268.field8779 + var18;
         int var9 = this.field9268.field8783 + var19;
         float var10 = var7.field8778 / (float)var7.field8779;
         float var11 = var7.field8777 / (float)var7.field8783;
         float var12 = (float)(-arg3 + var18) * var10;
         float var13 = (float)(var8 - arg3) * var10;
         float var14 = var7.field8777 - (float)(-arg4 + var19) * var11;
         float var15 = var7.field8777 - (float)(-arg4 + var9) * var11;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9268.field8777);
         OpenGL.glMultiTexCoord2f(33985, var12, var14);
         OpenGL.glVertex2i(var18, var19);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var12, var15);
         OpenGL.glVertex2i(var18, var19 - -this.field9268.field8783);
         OpenGL.glMultiTexCoord2f(33984, this.field9268.field8778, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var13, var15);
         OpenGL.glVertex2i(this.field9268.field8779 + var18, this.field9268.field8783 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field9268.field8778, this.field9268.field8777);
         OpenGL.glMultiTexCoord2f(33985, var13, var14);
         OpenGL.glVertex2i(this.field9268.field8779 + var18, var19);
         OpenGL.glEnd();
         this.field9270.method4814(7681, 0, 5890, 768);
         this.field9270.method4796(false, 0);
         this.field9270.method4818((byte)-113, (class689)null);
         this.field9270.method4828(0, (byte)66);
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field9299[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9299[1] : field9299[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 725
   )
   public final void method1973(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field9271;
         if (this.field9282) {
            float var11 = (float)this.method1971();
            float var12 = (float)this.method1975();
            float var13 = (-arg0 + arg2) / var11;
            float var14 = (-arg1 + arg3) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (-arg1 + arg5) / var12;
            float var17 = (float)this.field9269 * var15;
            float var18 = (float)this.field9269 * var16;
            float var19 = (float)this.field9272 * var13;
            float var20 = (float)this.field9272 * var14;
            float var21 = (float)this.field9288 * -var13;
            float var22 = (float)this.field9288 * -var14;
            float var23 = (float)this.field9291 * -var15;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            float var24 = (float)this.field9291 * -var16;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
         }

         float var25 = -arg0 + arg2 + arg4;
         this.field9268.method5012(~(arg9 & 1) != -1, -10161);
         float var26 = arg5 - arg1 + arg3;
         this.field9270.method4817((byte)-111);
         this.field9270.method4818((byte)-117, this.field9268);
         this.field9270.method4854(-3, arg8);
         this.field9270.method4796(false, arg6);
         OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field9268.field8777);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glTexCoord2f(this.field9268.field8778, 0.0F);
         OpenGL.glVertex2f(var25, var26);
         OpenGL.glTexCoord2f(this.field9268.field8778, this.field9268.field8777);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
      } catch (RuntimeException var28) {
         throw class670.method4877(var28, field9299[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

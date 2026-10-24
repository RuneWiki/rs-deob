package deob;

@ObfuscatedName("FUVVWALN")
public class FUVVWALN {

	@ObfuscatedName("FUVVWALN.g")
	public int field663 = 0;

	@ObfuscatedName("FUVVWALN.h")
	public int field664 = 0;

	@ObfuscatedName("FUVVWALN.i")
	public int field665;

	@ObfuscatedName("FUVVWALN.j")
	public int field666;

	@ObfuscatedName("FUVVWALN.k")
	public int[][] field667;

	public FUVVWALN(int arg0, int arg1) {
		field665 = arg0;
		field666 = arg1;
		field667 = new int[field665][field666];
		method228();
	}

	@ObfuscatedName("FUVVWALN.a()V")
	public void method228() {
		for (int var1 = 0; var1 < field665; var1++) {
			for (int var2 = 0; var2 < field666; var2++) {
				if (var1 == 0 || var2 == 0 || field665 - 1 == var1 || field666 - 1 == var2) {
					field667[var1][var2] = 0xFFFFFF;
				} else {
					field667[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("FUVVWALN.a(IZIBII)V")
	public void method229(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field663;
		arg4 -= field664;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method232(arg3, arg4, 128);
				method232(arg3 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method232(arg3, arg4, 2);
				method232(arg3, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method232(arg3, arg4, 8);
				method232(arg3 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method232(arg3, arg4, 32);
				method232(arg3, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method232(arg3, arg4, 1);
				method232(arg3 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method232(arg3, arg4, 4);
				method232(arg3 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method232(arg3, arg4, 16);
				method232(arg3 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method232(arg3, arg4, 64);
				method232(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method232(arg3, arg4, 130);
				method232(arg3 - 1, arg4, 8);
				method232(arg3, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method232(arg3, arg4, 10);
				method232(arg3, arg4 + 1, 32);
				method232(arg3 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method232(arg3, arg4, 40);
				method232(arg3 + 1, arg4, 128);
				method232(arg3, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method232(arg3, arg4, 160);
				method232(arg3, arg4 - 1, 2);
				method232(arg3 - 1, arg4, 8);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method232(arg3, arg4, 0x10000);
					method232(arg3 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method232(arg3, arg4, 1024);
					method232(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method232(arg3, arg4, 4096);
					method232(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method232(arg3, arg4, 16384);
					method232(arg3, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method232(arg3, arg4, 512);
					method232(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method232(arg3, arg4, 2048);
					method232(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method232(arg3, arg4, 8192);
					method232(arg3 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method232(arg3, arg4, 32768);
					method232(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method232(arg3, arg4, 66560);
					method232(arg3 - 1, arg4, 4096);
					method232(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method232(arg3, arg4, 5120);
					method232(arg3, arg4 + 1, 16384);
					method232(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method232(arg3, arg4, 20480);
					method232(arg3 + 1, arg4, 0x10000);
					method232(arg3, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method232(arg3, arg4, 81920);
					method232(arg3, arg4 - 1, 1024);
					method232(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("FUVVWALN.a(IIIZIII)V")
	public void method230(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field663;
		arg5 -= field664;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg4;
			arg4 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field665) {
				for (int var10 = arg5; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field666) {
						method232(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("FUVVWALN.a(IIZ)V")
	public void method231(int arg0, int arg1) {
		arg0 -= field663;
		arg1 -= field664;
		field667[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("FUVVWALN.a(III)V")
	public void method232(int arg0, int arg1, int arg2) {
		field667[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("FUVVWALN.a(IIIIZI)V")
	public void method233(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg1 -= field663;
		arg2 -= field664;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method235(arg1, arg2, 128);
				method235(arg1 - 1, arg2, 8);
			}

			if (arg0 == 1) {
				method235(arg1, arg2, 2);
				method235(arg1, arg2 + 1, 32);
			}

			if (arg0 == 2) {
				method235(arg1, arg2, 8);
				method235(arg1 + 1, arg2, 128);
			}

			if (arg0 == 3) {
				method235(arg1, arg2, 32);
				method235(arg1, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method235(arg1, arg2, 1);
				method235(arg1 - 1, arg2 + 1, 16);
			}

			if (arg0 == 1) {
				method235(arg1, arg2, 4);
				method235(arg1 + 1, arg2 + 1, 64);
			}

			if (arg0 == 2) {
				method235(arg1, arg2, 16);
				method235(arg1 + 1, arg2 - 1, 1);
			}

			if (arg0 == 3) {
				method235(arg1, arg2, 64);
				method235(arg1 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method235(arg1, arg2, 130);
				method235(arg1 - 1, arg2, 8);
				method235(arg1, arg2 + 1, 32);
			}

			if (arg0 == 1) {
				method235(arg1, arg2, 10);
				method235(arg1, arg2 + 1, 32);
				method235(arg1 + 1, arg2, 128);
			}

			if (arg0 == 2) {
				method235(arg1, arg2, 40);
				method235(arg1 + 1, arg2, 128);
				method235(arg1, arg2 - 1, 2);
			}

			if (arg0 == 3) {
				method235(arg1, arg2, 160);
				method235(arg1, arg2 - 1, 2);
				method235(arg1 - 1, arg2, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method235(arg1, arg2, 0x10000);
					method235(arg1 - 1, arg2, 4096);
				}

				if (arg0 == 1) {
					method235(arg1, arg2, 1024);
					method235(arg1, arg2 + 1, 16384);
				}

				if (arg0 == 2) {
					method235(arg1, arg2, 4096);
					method235(arg1 + 1, arg2, 0x10000);
				}

				if (arg0 == 3) {
					method235(arg1, arg2, 16384);
					method235(arg1, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method235(arg1, arg2, 512);
					method235(arg1 - 1, arg2 + 1, 8192);
				}

				if (arg0 == 1) {
					method235(arg1, arg2, 2048);
					method235(arg1 + 1, arg2 + 1, 32768);
				}

				if (arg0 == 2) {
					method235(arg1, arg2, 8192);
					method235(arg1 + 1, arg2 - 1, 512);
				}

				if (arg0 == 3) {
					method235(arg1, arg2, 32768);
					method235(arg1 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method235(arg1, arg2, 66560);
					method235(arg1 - 1, arg2, 4096);
					method235(arg1, arg2 + 1, 16384);
				}

				if (arg0 == 1) {
					method235(arg1, arg2, 5120);
					method235(arg1, arg2 + 1, 16384);
					method235(arg1 + 1, arg2, 0x10000);
				}

				if (arg0 == 2) {
					method235(arg1, arg2, 20480);
					method235(arg1 + 1, arg2, 0x10000);
					method235(arg1, arg2 - 1, 1024);
				}

				if (arg0 == 3) {
					method235(arg1, arg2, 81920);
					method235(arg1, arg2 - 1, 1024);
					method235(arg1 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("FUVVWALN.a(IZIIZII)V")
	public void method234(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field663;
		arg4 -= field664;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field665) {
				for (int var10 = arg4; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field666) {
						method235(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("FUVVWALN.a(IIII)V")
	public void method235(int arg0, int arg1, int arg2) {
		field667[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("FUVVWALN.b(III)V")
	public void method236(int arg0, int arg1) {
		arg1 -= field663;
		arg0 -= field664;
		field667[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("FUVVWALN.a(IIIIIII)Z")
	public boolean method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg1) {
			return true;
		}

		arg4 -= field663;
		arg0 -= field664;
		arg3 -= field663;
		arg1 -= field664;
		if (arg5 == 0) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field667[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field667[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field667[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field667[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field667[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field667[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field667[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field667[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg3 == arg4 && arg1 + 1 == arg0 && (field667[arg4][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg1 - 1 == arg0 && (field667[arg4][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg1 && (field667[arg4][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FUVVWALN.a(IIBIIII)Z")
	public boolean method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg1) {
			return true;
		}

		arg5 -= field663;
		arg1 -= field664;
		arg4 -= field663;
		arg0 -= field664;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg4 + 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg1 && (field667[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg1 && (field667[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg1 && (field667[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 + 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg1 && (field667[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg4 == arg5 && arg0 + 1 == arg1 && (field667[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg1 && (field667[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg0 == arg1 && (field667[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FUVVWALN.a(IIIIIIII)Z")
	public boolean method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg3 - 1;
		int var9 = arg0 + arg2 - 1;
		if (arg5 >= arg1 && arg5 <= var8 && arg6 >= arg0 && arg6 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg6 >= arg0 && arg6 <= var9 && (field667[arg5 - field663][arg6 - field664] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg6 >= arg0 && arg6 <= var9 && (field667[arg5 - field663][arg6 - field664] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg5 >= arg1 && arg5 <= var8 && (field667[arg5 - field663][arg6 - field664] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg5 >= arg1 && arg5 <= var8 && (field667[arg5 - field663][arg6 - field664] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}

package deob;

@ObfuscatedName("BBOYCGQQ")
public class BBOYCGQQ {

	@ObfuscatedName("BBOYCGQQ.e")
	public int field116 = 0;

	@ObfuscatedName("BBOYCGQQ.f")
	public int field117 = 0;

	@ObfuscatedName("BBOYCGQQ.g")
	public int field118;

	@ObfuscatedName("BBOYCGQQ.h")
	public int field119;

	@ObfuscatedName("BBOYCGQQ.i")
	public int[][] field120;

	public BBOYCGQQ(int arg0, int arg1) {
		field118 = arg1;
		field119 = arg0;
		field120 = new int[field118][field119];
		method27();
	}

	@ObfuscatedName("BBOYCGQQ.a()V")
	public void method27() {
		for (int var1 = 0; var1 < field118; var1++) {
			for (int var2 = 0; var2 < field119; var2++) {
				if (var1 == 0 || var2 == 0 || field118 - 1 == var1 || field119 - 1 == var2) {
					field120[var1][var2] = 0xFFFFFF;
				} else {
					field120[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("BBOYCGQQ.a(BIIIZI)V")
	public void method28(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg4 -= field116;
		arg0 -= field117;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method31(arg4, arg0, 128);
				method31(arg4 - 1, arg0, 8);
			}

			if (arg2 == 1) {
				method31(arg4, arg0, 2);
				method31(arg4, arg0 + 1, 32);
			}

			if (arg2 == 2) {
				method31(arg4, arg0, 8);
				method31(arg4 + 1, arg0, 128);
			}

			if (arg2 == 3) {
				method31(arg4, arg0, 32);
				method31(arg4, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method31(arg4, arg0, 1);
				method31(arg4 - 1, arg0 + 1, 16);
			}

			if (arg2 == 1) {
				method31(arg4, arg0, 4);
				method31(arg4 + 1, arg0 + 1, 64);
			}

			if (arg2 == 2) {
				method31(arg4, arg0, 16);
				method31(arg4 + 1, arg0 - 1, 1);
			}

			if (arg2 == 3) {
				method31(arg4, arg0, 64);
				method31(arg4 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method31(arg4, arg0, 130);
				method31(arg4 - 1, arg0, 8);
				method31(arg4, arg0 + 1, 32);
			}

			if (arg2 == 1) {
				method31(arg4, arg0, 10);
				method31(arg4, arg0 + 1, 32);
				method31(arg4 + 1, arg0, 128);
			}

			if (arg2 == 2) {
				method31(arg4, arg0, 40);
				method31(arg4 + 1, arg0, 128);
				method31(arg4, arg0 - 1, 2);
			}

			if (arg2 == 3) {
				method31(arg4, arg0, 160);
				method31(arg4, arg0 - 1, 2);
				method31(arg4 - 1, arg0, 8);
			}
		}

		if (arg3) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method31(arg4, arg0, 0x10000);
					method31(arg4 - 1, arg0, 4096);
				}

				if (arg2 == 1) {
					method31(arg4, arg0, 1024);
					method31(arg4, arg0 + 1, 16384);
				}

				if (arg2 == 2) {
					method31(arg4, arg0, 4096);
					method31(arg4 + 1, arg0, 0x10000);
				}

				if (arg2 == 3) {
					method31(arg4, arg0, 16384);
					method31(arg4, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method31(arg4, arg0, 512);
					method31(arg4 - 1, arg0 + 1, 8192);
				}

				if (arg2 == 1) {
					method31(arg4, arg0, 2048);
					method31(arg4 + 1, arg0 + 1, 32768);
				}

				if (arg2 == 2) {
					method31(arg4, arg0, 8192);
					method31(arg4 + 1, arg0 - 1, 512);
				}

				if (arg2 == 3) {
					method31(arg4, arg0, 32768);
					method31(arg4 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method31(arg4, arg0, 66560);
					method31(arg4 - 1, arg0, 4096);
					method31(arg4, arg0 + 1, 16384);
				}

				if (arg2 == 1) {
					method31(arg4, arg0, 5120);
					method31(arg4, arg0 + 1, 16384);
					method31(arg4 + 1, arg0, 0x10000);
				}

				if (arg2 == 2) {
					method31(arg4, arg0, 20480);
					method31(arg4 + 1, arg0, 0x10000);
					method31(arg4, arg0 - 1, 1024);
				}

				if (arg2 == 3) {
					method31(arg4, arg0, 81920);
					method31(arg4, arg0 - 1, 1024);
					method31(arg4 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BBOYCGQQ.a(IIIIIZI)V")
	public void method29(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field116;
		arg0 -= field117;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field118) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field119) {
						method31(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("BBOYCGQQ.a(IIZ)V")
	public void method30(int arg0, int arg1) {
		arg1 -= field116;
		arg0 -= field117;
		field120[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("BBOYCGQQ.a(III)V")
	public void method31(int arg0, int arg1, int arg2) {
		field120[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("BBOYCGQQ.a(IIIIIZ)V")
	public void method32(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg0 -= field116;
		arg2 -= field117;
		if (arg1 == 0) {
			if (arg3 == 0) {
				method34(arg0, arg2, 128);
				method34(arg0 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method34(arg0, arg2, 2);
				method34(arg0, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method34(arg0, arg2, 8);
				method34(arg0 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method34(arg0, arg2, 32);
				method34(arg0, arg2 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				method34(arg0, arg2, 1);
				method34(arg0 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method34(arg0, arg2, 4);
				method34(arg0 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method34(arg0, arg2, 16);
				method34(arg0 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method34(arg0, arg2, 64);
				method34(arg0 - 1, arg2 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg3 == 0) {
				method34(arg0, arg2, 130);
				method34(arg0 - 1, arg2, 8);
				method34(arg0, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method34(arg0, arg2, 10);
				method34(arg0, arg2 + 1, 32);
				method34(arg0 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method34(arg0, arg2, 40);
				method34(arg0 + 1, arg2, 128);
				method34(arg0, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method34(arg0, arg2, 160);
				method34(arg0, arg2 - 1, 2);
				method34(arg0 - 1, arg2, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					method34(arg0, arg2, 0x10000);
					method34(arg0 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method34(arg0, arg2, 1024);
					method34(arg0, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method34(arg0, arg2, 4096);
					method34(arg0 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method34(arg0, arg2, 16384);
					method34(arg0, arg2 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					method34(arg0, arg2, 512);
					method34(arg0 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method34(arg0, arg2, 2048);
					method34(arg0 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method34(arg0, arg2, 8192);
					method34(arg0 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method34(arg0, arg2, 32768);
					method34(arg0 - 1, arg2 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg3 == 0) {
					method34(arg0, arg2, 66560);
					method34(arg0 - 1, arg2, 4096);
					method34(arg0, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method34(arg0, arg2, 5120);
					method34(arg0, arg2 + 1, 16384);
					method34(arg0 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method34(arg0, arg2, 20480);
					method34(arg0 + 1, arg2, 0x10000);
					method34(arg0, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method34(arg0, arg2, 81920);
					method34(arg0, arg2 - 1, 1024);
					method34(arg0 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BBOYCGQQ.a(ZBIIIII)V")
	public void method33(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg3 -= field116;
		arg5 -= field117;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < field118) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field119) {
						method34(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("BBOYCGQQ.a(IIZI)V")
	public void method34(int arg0, int arg1, int arg2) {
		field120[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("BBOYCGQQ.a(BII)V")
	public void method35(int arg0, int arg1) {
		arg1 -= field116;
		arg0 -= field117;
		field120[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("BBOYCGQQ.a(IIIIIII)Z")
	public boolean method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field116;
		arg4 -= field117;
		arg0 -= field116;
		arg1 -= field117;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field120[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field120[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field120[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field120[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field120[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field120[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field120[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field120[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field120[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field120[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg3 && arg1 == arg4 && (field120[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BBOYCGQQ.b(IIIIIII)Z")
	public boolean method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg4 == arg5) {
			return true;
		}

		arg2 -= field116;
		arg5 -= field117;
		arg3 -= field116;
		arg4 -= field117;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg3 + 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field120[arg2][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field120[arg2][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field120[arg2][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 + 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field120[arg2][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg2 == arg3 && arg4 + 1 == arg5 && (field120[arg2][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg4 - 1 == arg5 && (field120[arg2][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg2 && arg4 == arg5 && (field120[arg2][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BBOYCGQQ.a(IIIIIIII)Z")
	public boolean method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg4 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg5 >= arg2 && arg5 <= var8 && arg1 >= arg6 && arg1 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg5 && arg1 >= arg6 && arg1 <= var9 && (field120[arg5 - field116][arg1 - field117] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg1 >= arg6 && arg1 <= var9 && (field120[arg5 - field116][arg1 - field117] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg5 >= arg2 && arg5 <= var8 && (field120[arg5 - field116][arg1 - field117] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg5 >= arg2 && arg5 <= var8 && (field120[arg5 - field116][arg1 - field117] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
